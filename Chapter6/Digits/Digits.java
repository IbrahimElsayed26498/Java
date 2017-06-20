// Digits.java

import java.util.Scanner;

public class Digits
{
  public static void main( String[] args )
  {
    System.out.println("This Program Prints An Integer As A Series Of Digits");
    Scanner input = new Scanner(System.in);

    // Appropriate variable declarations
  	int binary; // binary integer and its decimal equivalent

    int binary_buffer, binary_length = 0; // A buffer to hold the binary integer and a variable for its length

    System.out.println("Enter An Integer  : ");
  	binary = input.nextInt();

    displayDigits( binary );
  }

  public static void displayDigits( int digit )
  {
    int[] digits = new int[10];
    int buffer = digit;
    int digit_length = 0;

    // While loop determines the length of digit
    while (digit != 0) {
        	digit_length++;
        	digit /= 10;
    }

    digit = buffer;

  	// for loop splits digit into its respective digits
    int k = (int) (Math.pow(10, digit_length - 1 ));

    for ( int i = 0; i < digit_length; i++ ){
  		digits[i] = digit/k;
  		digit %= k;
  		if (k > 0)
  			k /= 10;
  	}

  	// Final Output Section
  	System.out.printf("%d broken into digits is ", buffer );
  	for (int l = 0; l < digit_length; l++ ){
  		System.out.printf("%d  ", digits[l]);
  	}
  	System.out.println("");
  }
}
