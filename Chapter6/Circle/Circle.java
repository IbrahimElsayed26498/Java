// Circle.java

import java.util.Scanner;

public class Circle
{
  public static void main(String[] args)
  {
    double radius;

    Scanner input = new Scanner( System.in );

    System.out.println("Enter A Figure For Radius : ");
    radius = input.nextDouble();

    System.out.printf("The area of circle with radius %.2f is %.2f", radius, circleArea( radius ) );
  }

  public static double circleArea( double r )
  {
    final double pie = 22/7;//3.14159;
    return 2.0 * pie * r;
  }
}
