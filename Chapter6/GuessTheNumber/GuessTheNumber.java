// GuessTheNumber.java

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber
{
    public static void main(String[] args )
    {
      System.out.println(" Program plays the guess the number game");
  	  System.out.println(" I have a number between 1 and 1000");
  	  System.out.println(" Can you guess my number ? ");

      Scanner input = new Scanner( System.in );

      char flag = 'y';
  	  int seed = 1;
      int count = 0;

      int myGuess, response;

  	  while (flag == 'y')
      {
  		  response = guess();

        do
        {
  			   System.out.println(" Please type your guess : ");
           myGuess = input.nextInt();
           count++;

  			   if (myGuess == response)
  				     System.out.printf( "Excellent!  You guessed the number !");
  			   else if (myGuess < response)
  				     System.out.printf("Is Too Low! Try Again");
  			   else
  				     System.out.printf("Is Too High! Try Again");

  		  } while (myGuess != response);

        if ( ( count < 10 ) && ( myGuess == response))
            System.out.println("\nEither you know the secret or you got lucky !");
        if ( (count == 10) && ( myGuess == response))
            System.out.println( "\nAha! You know the secret");
        else if ((count > 10 ) && ( myGuess == response))
            System.out.println( "\nYou should be able to do better! ");


  		  System.out.printf("\nWould You Like To Play Again ? y for Yes Or n for No ");
  		  flag = input.next().charAt( 0 );

  		  if (flag == 'y')
        {
  			  System.out.println(" Enter A Seed : ");
  			  seed = input.nextInt();
  		  }
    }
  }

  public static int guess( )
  {
    Random randomNumber = new Random();
    int faces;
    faces = 1 + randomNumber.nextInt(1000);
  	return faces;
  }
}
