// PointTest.java

import java.util.Scanner;

public class PointTest
{
  public static void main(String[] args )
  {
    Point first = new Point(10,8);
    Point second = new Point(1, 9);

    System.out.printf(
      "The Euclidean Distance Between ( %.2f, %.2f ) And ( %.2f, %.2f ) Is %.2f"
      , first.getXCoordinate()
      , first.getYCoordinate()
      , second.getXCoordinate()
      , second.getYCoordinate()
      , Point.distance( first, second ) );
  }
}
