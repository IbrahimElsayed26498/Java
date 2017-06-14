// Fig 5.27 ShapesTest.java
// Test applicatioin that displays class ShapesTest

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest
{
  public static void main(String[] args)
  {
    String input = JOptionPane.showInputDialog(
    "Enter 1 To Draw rectangles\n" +
    "Enter 2 To Draw Ovals");

    int choice = Integer.parseInt( input);

    Shapes panel = new Shapes ( choice );
    JFrame application = new JFrame();

    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    application.add( panel ); // add the panel to the frame
    application.setSize( 300, 300 ); // set the desired size
    application.setVisible( true );
  } // end main
} // end class ShapesTest
