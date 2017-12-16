/**
 * Figure 15.13 : FileChooserTest.java
 * Tests class FileChooserDemo
 */

import java.io.IOException;
import javax.swing.JFrame;

public class FileChooserTest {

    public static void main(String[] args) throws IOException
    {
        FileChooserDemo application = new FileChooserDemo();
        application.setSize(400, 400);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
}
