// Maximum.java

import java.util.Scanner;

public class Minimum
{

  public static void main (String[] args)
  {
    System.out.println("Program Prints The Smallest Integer In a Decuple");

    Scanner input = new Scanner(System.in);

    int counter = 0;
    int secondSmallest, smallest;

    int[] array = new int[10];

    System.out.println("Enter 10 Integers ( -1 To Quit)");
    for ( int i = 0; i < 10; i++)
    {
      System.out.printf(" %d : ", i + 1 );
      array[i] = input.nextInt();
    }
    smallest = array[0];
    secondSmallest = array[1];

    while ( counter < 10)
    {

      if ( array[counter] == -1)
        break;
      if ( array[counter] < smallest )
      {
        secondSmallest = smallest;
        smallest = array[counter];
      }

      counter++;
    }

    System.out.printf("The Two Smallest Integers In This Decuple Are %d And %d", smallest, secondSmallest);
  }
}
