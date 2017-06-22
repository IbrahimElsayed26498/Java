// SquareSpiralTest.java
// Test application to display a Square Spiral

import javax.swing.JFrame;

public class SquareSpiralTest
{
  public static void main( String[] args )
  {
    SquareSpiral panel = new SquareSpiral();
    JFrame application = new JFrame();

    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    application.add( panel );
    application.setSize( 700, 700 );
    application.setVisible( true );
  }
}
