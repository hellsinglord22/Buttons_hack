import sun.text.resources.FormatData_zh_CN;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Scorpion
 * @Date: 3/16/2015.
 */
public class Form extends JPanel {
    /*Attributes*/
    private GridBagConstraints formConstrain;
    private JLabel nameLabel,ageLabel;
    private JTextField nameTextField;
    private Border innerBorder , outerBorder;
    private JList ageList;
    private DefaultListModel ageModel;
    private JButton okButton;

    /*Constructor*/
    public Form() {
        /// Initialize Attributes ///
        formConstrain = new GridBagConstraints();
        nameLabel = new JLabel("Name: ");
        ageLabel = new JLabel("Age: ");
        nameTextField = new JTextField(15);
        okButton = new JButton("OK");
        innerBorder = BorderFactory.createTitledBorder("hacking form");
        outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        ageList = new JList();
        ageModel = new DefaultListModel();

        // add other attributes properties //
        ageModel.addElement(new AgeCategory(0, "under 18"));
        ageModel.addElement(new AgeCategory(1, "18 to 65"));
        ageModel.addElement(new AgeCategory(2, "Over 65"));
        ageList.setModel(ageModel);

        ageList.setSelectedIndex(1); /// select the element in the middle
        ageList.setSize(110, 70);
        ageList.setBorder(BorderFactory.createEtchedBorder());


        // properties //
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

        // position attributes //

        // PREPOSITIONING PROPERTIES //
        formConstrain.fill = GridBagConstraints.NONE;
        formConstrain.weightx = 0.1 ;
        formConstrain.weighty = 0.1;

        // first row //
        formConstrain.anchor = GridBagConstraints.LINE_END;
        setCurrentPosition(0, 0);
        add(nameLabel, formConstrain);

        formConstrain.anchor = GridBagConstraints.LINE_START;
        setCurrentPosition(0, 1);
        add(nameTextField, formConstrain);

        // second row //
        formConstrain.anchor = GridBagConstraints.LINE_END;
        setCurrentPosition(1, 0);
        add(ageLabel, formConstrain);

        formConstrain.anchor = GridBagConstraints.LINE_START;
        setCurrentPosition(1, 1);
        add(ageList, formConstrain);

        // third row ///

        // lets change the weight of the row to make it take more space and push other elements to the top
        formConstrain.weighty = 2;
        formConstrain.anchor = GridBagConstraints.LINE_END;
        setCurrentPosition(2, 0);
        add(okButton, formConstrain);


        ///ELEMENT'S BEHAVIOUR ///
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AgeCategory age = (AgeCategory) ageList.getSelectedValue();
                System.out.println("Age: " + age + "\n");
            }
        });


    }

    /*Methods*/
    // Method to help position elements on the form //
    private void setCurrentPosition(int row, int column) {
        formConstrain.gridx = column;
        formConstrain.gridy = row;
    }
}

class AgeCategory{
    /*Attributes*/
    private int id;
    private String text;

    /*Constructor*/
    public AgeCategory() {
        this.id = 0;
        this.text = null;
    }

    public AgeCategory(int id, String text) {
        this.id = id;
        this.text = text;
    }

    /*Methods*/

    @Override
    public String toString() {
        return text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}


