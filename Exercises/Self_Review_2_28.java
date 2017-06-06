// Self_Review_2_28.java
// Program determines diameter, area and circumference of a circle

import java.util.Scanner;

public class Self_Review_2_28
{
  public static void main ( String[] args )
  {
    System.out.println("Program determines Diameter, Area & circumference");

    float radius;
    Scanner input = new Scanner (System.in);

    System.out.println("Enter A value For Radius : ");
    radius = input.nextInt();

    System.out.printf("The diameter of your circle is %3f\n", 2 * radius);
    System.out.printf("The area of your circle is %f\n", 22 / 7 * radius * radius);
    System.out.printf("The circumference of your circle is %f\n", 2 * 22 / 7 * radius);

  }
}
