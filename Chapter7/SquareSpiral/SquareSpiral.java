// SquareSpiral.java
// Draws A Square Spiral

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class SquareSpiral extends JPanel
{
  private final static Color RED = Color.RED;

  public SquareSpiral()
  {
    setBackground( Color.WHITE ); // set background to white
  }

  public void paintComponent( Graphics g )
  {
    super.paintComponent( g );

    // set the color
    g.setColor( RED );

    //start the center
    int centerX = getWidth() / 2;
    int centerY = getHeight() - 350;

    int[] L = { 75, 150, 225, 300 };

    g.drawLine( centerX, centerY, centerX, centerY + L[0] );
    g.drawLine( centerX, centerY + L[0], centerX - L[0] , centerY + L[0] );

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
    g.drawLine( centerX + L[2], centerY - L[2], centerX + L[2] , centerY + L[3] );


  }
}
