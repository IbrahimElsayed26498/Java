// Maximum.java

import java.util.Scanner;

public class Maximum
{

  public static void main (String[] args)
  {
    System.out.println("Program Prints The Largest Integer In a Decuple");

    Scanner input = new Scanner(System.in);

    int counter = 0;
    int number, largest;

    int[] array = new int[10];

    System.out.println("Enter 10 Integers ( -1 To Quit)");

    largest = array[0];
    while ( counter < 10)
    {
      System.out.printf(" %d : ", counter + 1 );
      array[counter] = input.nextInt();


      if ( array[counter] == -1)
        break;
      if ( array[counter] > largest )
        largest = array[counter];

      counter++;
    }

    System.out.printf("The Largest Integer In This Decuple Is %d", largest);
  }
}
