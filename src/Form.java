import javax.swing.*;
import java.awt.*;

/**
 * @Author: Scorpion
 * @Date: 3/16/2015.
 */
public class Form extends JPanel {
    /*Attributes*/
    private GridBagConstraints formConstrain;

    /*Constructor*/
    public Form() {
        /// Initialize Attributes ///
        formConstrain = new GridBagConstraints();


        // properties //
        setLayout(new GridBagLayout());

        // position attributes //

        // PREPOSITIONING PROPERTIES //
        formConstrain.fill = GridBagConstraints.NONE;

    }

    /*Methods*/
    // Method to help position elements on the form //
    private void setCurrentPosition(int row, int column) {
        formConstrain.gridx = column;
        formConstrain.gridy = row;
    }
}


