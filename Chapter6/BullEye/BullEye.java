import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class BullEye extends JPanel
{
  public void paintComponent ( Graphics g )
  {
    super.paintComponent( g );

    Random randomNumberOne = new Random();
    Color firstColor = new Color( randomNumberOne.nextInt(255), randomNumberOne.nextInt(255), randomNumberOne.nextInt(255));

    Random randomNumberTwo = new Random();
    Color secondColor = new Color( randomNumberTwo.nextInt(255), randomNumberTwo.nextInt(255), randomNumberTwo.nextInt(255));

    //draw the first circle
    g.setColor( firstColor );
    g.fillOval( 10, 10, 200, 200 );

    // draw the second circle
    g.setColor( secondColor );
    g.fillOval( 30, 30, 160, 160 );

    // draw the third circle
    g.setColor( firstColor );
    g.fillOval( 50, 50, 120, 120 );

    // draw the fourth circle
    g.setColor( secondColor );
    g.fillOval( 65, 65, 90, 90 );

    // draw the fifth circle
    g.setColor( firstColor );
    g.fillOval( 80, 80, 60, 60 );
  }
}
