import javax.swing.*;
import java.awt.*;

/**
 * @Author: Scorpion
 * @Date: 3/16/2015.
 */
public class MainFrame extends JFrame{

    /*Attributes*/



    /* Constructor*/

    public MainFrame(String title) {
        super(title);

        /// Initialize attributes //

        /// set properties //
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());

    }

}
