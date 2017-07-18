// Rectangle.java

public class Rectangle
{
  private double length = 1;
  private double width = 1;

  public Rectangle( double l, double w )
  {
    setLength( l );
    setWidth( w );
  }

  public void setLength( double l )
  {
    if ( l >= 0.0 && l <= 20.0 )
        length = l;
    else
      throw new IllegalArgumentException("Length Must Be In [0.0, 20.0]");
  }

  public void setWidth( double w )
  {
    if ( w >= 0.0 && w <= 20.0)
        width = w;
    else
      throw new IllegalArgumentException("Width Must Be In [0.0, 20.0]");
  }

  public double getLength()
  {
    return length;
  }

  public double getWidth()
  {
    return width;
  }
}
