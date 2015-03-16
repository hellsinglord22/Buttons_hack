import sun.text.resources.FormatData_zh_CN;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Scorpion
 * @Date: 3/16/2015.
 */
public class Form extends JPanel {
    /*Attributes*/
    private GridBagConstraints formConstrain;
    private JLabel nameLabel;
    private JTextField nameTextField;

    /*Constructor*/
    public Form() {
        /// Initialize Attributes ///
        formConstrain = new GridBagConstraints();
        nameLabel = new JLabel("Name: ");
        nameTextField = new JTextField(15);

        // properties //
        setLayout(new GridBagLayout());

        // position attributes //

        // PREPOSITIONING PROPERTIES //
        formConstrain.fill = GridBagConstraints.NONE;

        // first row //
        formConstrain.weightx = 0.1 ;
        formConstrain.weighty = 0.1;

        formConstrain.anchor = GridBagConstraints.LINE_END;
        setCurrentPosition(0, 0);
        add(nameLabel, formConstrain);

        formConstrain.anchor = GridBagConstraints.LINE_START;
        setCurrentPosition(0, 1);
        add(nameTextField, formConstrain);


    }

    /*Methods*/
    // Method to help position elements on the form //
    private void setCurrentPosition(int row, int column) {
        formConstrain.gridx = column;
        formConstrain.gridy = row;
    }
}


