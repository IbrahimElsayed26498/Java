// Analyses.java

import java.util.Scanner;

public class Analyses
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int passes = 0;
    int failures = 0;
    int studentCounter = 1;
    int result = 0;

    while ( studentCounter <= 10 )
    {
      // prompt user for input and obtain value from user
      System.out.print( "Enter result (1 = pass, 2 = fail): " );
      result = input.nextInt();

      while ( ( result == 1 ) || (result == 2) )
      {
        if (result == 1)
            passes++;
        if ( result == 2)
            failures++;

      }
      // increment studentCounter so loop eventually terminates
      studentCounter = studentCounter + 1;
    } // end while

    // termination phase; prepare and display results
    System.out.printf( "Passed: %d\nFailed: %d\n", passes, failures );

    if ( passes > 8 )
        System.out.println( "Bonus to instructor!" );
  }
}
