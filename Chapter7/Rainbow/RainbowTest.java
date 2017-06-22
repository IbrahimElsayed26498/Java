// RainbowTest.java
// Test application to display a rainbow

import javax.swing.JFrame;

public class RainbowTest
{
  public static void main( String[] args )
  {
    Rainbow panel = new Rainbow();
    JFrame application = new JFrame();

    application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    application.add( panel );
    application.setSize( 400, 400 );
    application.setVisible( true );
  }
}
