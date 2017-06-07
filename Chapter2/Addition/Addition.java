/* Addition.Java
   Program displays sum of two integers
*/

import java.util.Scanner; // Program uses Scanner class to read integers from keyboard

public class Addition
{
  public static void main(String[] args)
  {
    //Create a scanner to obtain input from keyboard
    Scanner input = new Scanner( System.in );

    int number1, number2;
    int sum;

    System.out.print("Enter First Integer : ");
    number1 = input.nextInt(); // Read first integer from user

    System.out.print("Enter Second Integer : ");
    number2 = input.nextInt(); // Read Second integr from user

    sum = number1 + number2;

    System.out.printf("%d + %d = %d", number1, number2, sum);
  }
}
