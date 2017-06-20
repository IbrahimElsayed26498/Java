// Point.java

public class Point
{
  private double xCoordinate;
  private double yCoordinate;

  public Point( int x, int y)
  {
    setXCoordinate( x );
    setYCoordinate( y );
  }

  public void setXCoordinate( int x )
  {
    xCoordinate = x;
  }

  public double getXCoordinate(  )
  {
    return xCoordinate;
  }

  public void setYCoordinate( int y )
  {
    yCoordinate = y;
  }

  public double getYCoordinate( )
  {
    return yCoordinate;
  }

  public static double distance ( Point X, Point Y )
  {
    return Math.sqrt( X.getXCoordinate() * X.getXCoordinate() + Y.getYCoordinate() * Y.getYCoordinate() );
  }
}
