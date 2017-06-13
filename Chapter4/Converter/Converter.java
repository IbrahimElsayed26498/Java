// Converter.java

import java.util.Scanner;

public class Converter
{
  public static void main(String[] args)
  {
    System.out.println("Program Prints The Decimal Equvalent Of A Binary Integer");

    int binary, decimal_equivalent = 0; // Binary integer and its decimal equivalent
    int binary_buffer, binary_length = 0; // A buffer to hold binary integer and a variable for its length
    int[] digits = new int[10]; // Array holding binay digits, their binary and decimal positional values
    int[] position = new int[10]; // Array holds binary digits positional values
    int[] holder = new int[10]; // Array holds integer digits positional values

    System.out.printf("Enter A Binay Number : ");
    Scanner input = new Scanner(System.in);

    binary = input.nextInt();
    binary_buffer = binary;

    // Determine the length of the binary
    while (binary != 0) {
      	binary_length++;
      	binary /= 10;
   	}

   	binary = binary_buffer;

    // Allocate values to holder[] and position[]
    int i = 0;
  	for (i = 0; i < 10; i++)
    {
  		holder[i] = ( int ) Math.pow(10, 9 - i);
  		position[i] = ( int ) Math.pow(2, 9 - i);
  		// cout << position[i] << "\t";
  	}
  	System.out.println();

    // for loop splits binary into its respective digits
  	int k = holder[10 - binary_length];
  	for ( i = 10 - binary_length; i < 10 ; i++ ){
  		digits[i] = binary/k;
  		binary %= k;
  		if (k > 0)
  			k /= 10;
  	}

    // Final Output Section
    int l;
  	for (l = 10 - binary_length ; l < 10; l++){
  		decimal_equivalent += digits[l] * position[l];
  	}

  	System.out.printf("The Decimal Equivalent Of %d Is %d", binary_buffer, decimal_equivalent);

  }
}
