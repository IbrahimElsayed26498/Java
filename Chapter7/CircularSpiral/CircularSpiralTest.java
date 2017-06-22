// CircularSpiralTest.java
// Test application to display a Circular Spiral

import javax.swing.JFrame;

public class CircularSpiralTest
{
  public static void main( String[] args )
  {
    CircularSpiral panel = new CircularSpiral();
    JFrame application = new JFrame();

    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    application.add( panel );
    application.setSize( 1000, 1000 );
    application.setVisible( true );
  }
}
