// BullEyeTest.java

import javax.swing.JFrame;

public class BullEyeTest
{
  public static void main( String[] args )
  {
    BullEye panel1 = new BullEye();
    JFrame application1 = new JFrame();

    BullEye panel2 = new BullEye();
    JFrame application2 = new JFrame();

    application1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    application1.add( panel1 );
    application1.setSize( 230, 250 );
    application1.setVisible( true );

    application2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    application2.add( panel2 );
    application2.setSize( 230, 250 );
    application2.setVisible( true );
  }
}
