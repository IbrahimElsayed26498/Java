// Rainbow.java
// Demonstrates Using Colors In An Array

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Rainbow extends JPanel
{
  // Define violet and indigo
  private final static Color VIOLET = new Color( 128, 0, 128 );
  private final static Color INDIGO = new Color( 75, 0, 130 );

  // colors to use in rainbow, starting from innermost
  // The two white entries in an empty arc in the center
  private Color[] colors =
      { Color.WHITE, Color.WHITE, VIOLET, INDIGO, Color.BLUE,
        Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED  };

  public Rainbow()
  {
    setBackground( Color.WHITE ); // set background to white
  }

  public void paintComponent( Graphics g )
  {
    super.paintComponent( g );

    int radius = 20; // radius of an arc

    //draw the rainbow near the bottom-center
    int centerX = getWidth() / 2;
    int centerY = getHeight() - 180;

    // draws filled arcs starting with the outermost
    for ( int counter = colors.length; counter > 0; counter-- )
    {
      // set the color for the current arc
      g.setColor( colors[ counter - 1 ] );

      // fill the arc from 0 to 180 degrees
      g.fillArc( centerX - counter * radius, centerY - counter * radius,
            counter * radius * 2, counter * radius * 2, -25, 230 );
    }
  }
}
