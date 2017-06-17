// Exercise_6_9.java

import java.util.Scanner;

public class Exercise_6_9
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner ( System.in );
    System.out.printf("Enter An Integer : ");
    double integer = input.nextDouble();

    System.out.printf(" Rounding Number %.2f To %.0f\n", integer, Math.floor( integer + 0.5 ));
  }
}
