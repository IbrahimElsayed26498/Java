import java.util.Scanner;

public class Cryptography
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.printf("Program Encrypts And Decrypts A Four-Digit Integer\n");

    int integer, integer_buffer, encrypted, decrypted;
    int[] integer_digits = new int[4]; // Holds digits of integer
    int[] integer_buffer_digits = new int[4]; // Holds copy of integer
    int[] temp = new int[4]; // Temporary Array
    int[] dividend = new int[4];
    int[] unswapped = new int[4];
    int[] original = new int[4];

    // prompt User For Four-Digit Integer
    System.out.println("Enter A Four-Digit Integer : ");
    integer = input.nextInt();
    integer_buffer = integer;
    System.out.println();

    // Split integer into individual digits
    int i, k = 1000;
    for ( i = 0; i < 4; i++ ){
  		// int a = i + 2, b = i - 2;
  		integer_digits[i] = integer/k;
  		dividend[i] = ( integer_digits[i] + 7 ) / 10;
  		integer_buffer_digits[i] = ( integer_digits[i] + 7 ) % 10; // Encryption Step 1
  		temp[i] = integer_buffer_digits[i]; // Temporarily hold these values
  		integer %= k;
  		if (k > 0)
  			k /= 10;
  	}
    System.out.println();

    // Encryption Step 2
  	integer_buffer_digits[0] = temp[2];
  	integer_buffer_digits[1] = temp[3];
  	integer_buffer_digits[2] = temp[0];
  	integer_buffer_digits[3] = temp[1];

    System.out.print("Unencrypted Integer = ");
    int j;

  	for (j = 0; j < 4;j++)
  		System.out.printf(" %d ", integer_digits[j]);
  	System.out.println();

  	System.out.print("Encrypted Integer = ");
    int l;

  	for (l = 0; l < 4;l++)
  		System.out.printf(" %d ", integer_buffer_digits[l]);
  	System.out.println();

  	// Decryption Begins
  	System.out.printf("Original Integer = ");
    int m;

  	for (m = 0; m < 4; m++){
  		unswapped[m] = temp[m]; // Step 1
  		original[m] = 10 * dividend[m] + temp[m] - 7; // Step 2
  		System.out.printf(" %d ", original[m]);
  	}
  	System.out.println();

  }
}
