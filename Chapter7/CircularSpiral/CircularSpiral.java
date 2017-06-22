import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class CircularSpiral extends JPanel
{
  private final static Color RED = Color.RED;

  public CircularSpiral()
  {
    setBackground( Color.WHITE ); // set background to white
  }

  public void paintComponent( Graphics g )
  {
    super.paintComponent( g );

    //start the center
    int centerX = getWidth() - 500;
    int centerY = getHeight() - 500;

    int[] L = { 75, 150, 225, 300 };

    g.drawArc( centerX, centerY, centerX , centerY, 0, 180 );
    /*g.drawLine( centerX, centerY + L[0], centerX - L[0] , centerY + L[0] );

    g.drawLine( centerX - L[0], centerY + L[0], centerX - L[0] , centerY - L[0] );
    g.drawLine( centerX - L[0], centerY - L[0], centerX + L[0] , centerY - L[0] );

    g.drawLine( centerX + L[0] , centerY - L[0], centerX + L[0] , centerY + L[1]);
    g.drawLine( centerX + L[0] , centerY + L[1], centerX - L[1] , centerY + L[1]);

    g.drawLine( centerX - L[1] , centerY + L[1], centerX - L[1] , centerY - L[1]);
    g.drawLine( centerX - L[1] , centerY - L[1], centerX + L[1] , centerY - L[1]);

    g.drawLine( centerX + L[1] , centerY - L[1], centerX + L[1] , centerY + L[2] );
    g.drawLine( centerX + L[1] , centerY + L[2], centerX - L[2] , centerY + L[2] );

    g.drawLine( centerX - L[2] , centerY + L[2], centerX - L[2] , centerY - L[2] );
    g.drawLine( centerX - L[2] , centerY - L[2], centerX - L[2] , centerY - L[2] );

    g.drawLine( centerX - L[2] , centerY - L[2], centerX + L[2], centerY - L[2] );
    g.drawLine( centerX + L[2], centerY - L[2], centerX + L[2] , centerY + L[3] );*/
  }
}
