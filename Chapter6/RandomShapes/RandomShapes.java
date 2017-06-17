import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

public class RandomShapes extends JPanel
{
  public void paintComponent ( Graphics g )
  {
    super.paintComponent( g );

    Random randomNumber1 = new Random();
    Random randomNumber2 = new Random();
    Random randomNumber3 = new Random();
    Random randomNumber4 = new Random();
    Random randomNumber5 = new Random();
    Random randomNumber6 = new Random();
    Random randomNumber7 = new Random();

    Color color1 = new Color( randomNumber1.nextInt(255), randomNumber1.nextInt(255), randomNumber1.nextInt(255));
    Color color2 = new Color( randomNumber2.nextInt(255), randomNumber2.nextInt(255), randomNumber2.nextInt(255) );
    Color color3 = new Color( randomNumber3.nextInt(255), randomNumber3.nextInt(255), randomNumber3.nextInt(255) );
    Color color4 = new Color( randomNumber4.nextInt(255), randomNumber4.nextInt(255), randomNumber4.nextInt(255) );
    Color color5 = new Color( randomNumber5.nextInt(255), randomNumber5.nextInt(255), randomNumber5.nextInt(255) );
    Color color6 = new Color( randomNumber6.nextInt(255), randomNumber6.nextInt(255), randomNumber6.nextInt(255) );
    Color color7 = new Color( randomNumber7.nextInt(255), randomNumber7.nextInt(255), randomNumber7.nextInt(255) );

    g.setColor( color1 );
    g.fillOval( 10 + randomNumber1.nextInt(50), 10 + randomNumber1.nextInt(50), 200, 200 );

    g.setColor( color2 );
    g.fillRect( 90 + randomNumber2.nextInt(30), 90 + randomNumber2.nextInt(30), 160, 160 );

    g.setColor( color3 );
    g.fillOval( 290 + randomNumber3.nextInt(30), 290 + randomNumber3.nextInt(30), 168, 168);

    g.setColor( color4 );
    g.fillRect( 20 + randomNumber4.nextInt(30), 290 + randomNumber4.nextInt(30), 400, 40);

    g.setColor( color5 );
    g.fillRect( 290 + randomNumber5.nextInt(30), 90 + randomNumber5.nextInt(30), 160, 160 );

    g.setColor( color6 );
    g.fillOval( randomNumber6.nextInt(30), 290 + randomNumber6.nextInt(30), 168, 168);

    g.setColor( color7 );
    g.fillRect( randomNumber7.nextInt(30), 290 + randomNumber7.nextInt(30), 168, 168 );
    g.fillOval( 100 + randomNumber7.nextInt(30), 300 + randomNumber7.nextInt(30), 16, 18);
  }
}
