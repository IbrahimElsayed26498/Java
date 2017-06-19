//Hypotenuse.java

import java.util.Scanner;

public class Hypotenuse
{
  public static void main( String[] args )
  {
    double[] side1 = new double[5];
    double[] side2 = new double[5];

    System.out.println("You'll Enter Values For Side1 : ");

    Scanner input = new Scanner( System.in );

    for ( int i = 0; i < 5; i++)
    {
      System.out.printf("Enter side1 %d : ", i + 1 );
      side1[i] = input.nextDouble();
    }

    System.out.println("You'll Now Enter Values For Side2 : ");

    for ( int j = 0; j < 5; j++)
    {
      System.out.printf("Enter side2 %d : ", j + 1 );
      side2[j] = input.nextDouble();
    }

    System.out.printf("Triangle\tSide1\tSide2\tHypotenuse\n");

    for ( int k = 0; k < 5; k++ )
    {
      System.out.printf("%d\t\t%.2f\t%.2f\t%.2f\n", k + 1, side1[k], side2[k], findHypotenuse( side1[k], side2[k]));
    }
  }

  public static double findHypotenuse(double base, double height)
  {
    return Math.sqrt( base * base + height * height );
  }
}
