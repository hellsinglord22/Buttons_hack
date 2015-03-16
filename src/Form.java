import sun.text.resources.FormatData_zh_CN;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

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
    /*Constructor*/
    public Form() {
        /// Initialize Attributes ///
        formConstrain = new GridBagConstraints();
        nameLabel = new JLabel("Name: ");
        ageLabel = new JLabel("Age: ");
        nameTextField = new JTextField(15);
        innerBorder = BorderFactory.createTitledBorder("hacking form");
        outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        ageList = new JList();
        ageModel = new DefaultListModel();

        // add other attributes properties //
        ageModel.addElement("under 18");
        ageModel.addElement("18 to 65");
        ageModel.addElement("Over 65");
        ageList.setModel(ageModel);


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


    }

    /*Methods*/
    // Method to help position elements on the form //
    private void setCurrentPosition(int row, int column) {
        formConstrain.gridx = column;
        formConstrain.gridy = row;
    }
}


