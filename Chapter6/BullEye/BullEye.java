import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class BullEye extends JPanel
{
  public void paintComponent ( Graphics g )
  {
    super.paintComponent( g );

    //draw the first circle
    g.setColor( Color.DARK_GRAY );
    g.fillOval( 10, 10, 200, 200 );

    // draw the second circle
    g.setColor( Color.GREEN );
    g.fillOval( 30, 30, 160, 160 );

    // draw the third circle
    g.setColor( Color.BLUE );
    g.fillOval( 50, 50, 120, 120 );

    // draw the fourth circle
    g.setColor( Color.CYAN );
    g.fillOval( 65, 65, 90, 90 );

    // draw the fifth circle
    g.setColor( Color.MAGENTA );
    g.fillOval( 80, 80, 60, 60 );
  }
}
