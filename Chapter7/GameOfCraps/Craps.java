// Craps.java

import java.util.Random;
import java.util.Scanner;

public class Craps
{
    private static final Random randomNumbers = new Random();

    private enum Status { CONTINUE , WON, LOST };

    //private static final int CONTINUE = 0;
    //private static final int WON = 1;
    //private static final int LOST = 2;

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main( String[] args )
    {
      if ( args.length == 0 )
      {
        System.out.printf("Run Game Of Craps N Times. Do \"java Craps N\" \n");
      }
      else // You're ready to play this gameOfCrabs
      {
        int bankBalance = 1000;
        System.out.printf("Your Bank Balance Is 5d\n", bankBalance);
    	  int wager;

        int rows = 2;
        int columns = Integer.parseInt(args[ 0 ]);

        int[][] gameStats = new int[rows][columns];

        // Initialise This Array Entries to zero
        for ( int i = 0; i < rows; i++ )
            for ( int j = 0; j < columns; j++)
                gameStats[i][j] = 0;

        int winningChances = 0;
        int lossingChances = 0;

        Scanner input = new Scanner( System.in );
        Random randomInteger = new Random();

        System.out.printf("You've Chosen To Play %d Games\n", columns );
        // Player Wants To Play Game of Craps 'roll' times

        for (int roll = 1; roll < Integer.parseInt( args[ 0 ] ); roll++)
        {
    	     do
           {
    		     System.out.println("Enter An Integer For A Wager : " );
    		     wager = randomInteger.nextInt();

    	     } while ( wager > bankBalance );

    	     Status current = gameOfCrabs();

    	     if ( current == Status.WON )
           {
              gameStats[0][roll]++;
    		      bankBalance += wager;
    		      System.out.println(" Bank Balance : " + bankBalance );
    		      if ( bankBalance >= 1100 )
    			       System.out.println("You're Up Big ! Keep it going !");
    		      if ( bankBalance >= 1500 )
    			       System.out.println("You're making enormous progress !" );
    	     }
    	     else
           {
              if ( current == Status.LOST )
                  gameStats[1][roll]++;

              bankBalance -= wager;
    		      System.out.println(" Bank Balance : " + bankBalance );
    		      if (bankBalance <= 100 )
    			      System.out.println( "Careful ! You're headed for broke !");
    		      if ( bankBalance == 0)
    			      System.out.println("Sorry ! You're Busted ! ");
    	     }

           // Number of times game is won
           for (int win : gameStats[0])
                winningChances += win;

           // Number of times player losses
           for (int lost : gameStats[1])
                lossingChances += lost;

         }// end for Finished playing Games 'roll' times

         double limit = getAccuracy( columns );

         System.out.printf("\n\nNumber Of WINS\t %d \nNumber Of LOSSES %d\nNumber of Games %d\n\n", Math.abs(winningChances/columns), Math.abs(lossingChances/columns), columns);
         System.out.printf("Your chances of winning Game of Craps Is %.2f\n", Math.abs(winningChances) * limit / columns );

      }// end else
    }// end main

    public static int rollDice()
    {
      int die1 = 1 + randomNumbers.nextInt(6);
      int die2 = 1 + randomNumbers.nextInt(6);

      int sum  = die1 + die2;

      System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);

      return sum;
    }

    public static Status gameOfCrabs()
    {


    	Status gameStatus;

    	int sumOfDice = rollDice();
      int myPoint  = sumOfDice;

    	switch( sumOfDice )
      {
    		case 7:
    		case 11:
    			gameStatus = Status.WON;
    			break;
    		case 2:
    		case 3:
    		case 12:
    			gameStatus = Status.LOST;
    		default:
    			gameStatus = Status.CONTINUE;
    			myPoint = sumOfDice;
    			System.out.println( "Point Is " + myPoint);
    			break;
    	}

    	while ( gameStatus == Status.CONTINUE )
      {
    		sumOfDice = rollDice();

    		if ( sumOfDice == myPoint )
    			gameStatus = Status.WON;
    		else if ( sumOfDice == 7 )
    				gameStatus = Status.LOST;
    	}

    	if ( gameStatus == Status.WON )
      {
    		System.out.println( "Player Wins " );
    		return gameStatus;
    	}
    	else
      {
    		System.out.println("Player Losses ");
    		return gameStatus;
    	}
    }

    public static double getAccuracy( int integer )
    {
      int c;
      c = getDigitLength( integer );
      double k;

      switch (c)
      {
        case 1:
        case 2:
          k = 10.0;
          break;
        case 3:
          k = 1.0;
          break;
        case 4:
          k = 0.1;
          break;
        case 5:
          k = 0.01;
          break;
        case 6:
          k = 0.001;
          break;
        case 7:
          k = 0.0001;
          break;
        case 8:
          k = 0.00001;
          break;
        case 9:
          k =  0.000001;
          break;
        default:
          System.out.println("Integer Entered Too Long");
          k = 1.0;
          break;
      }

      return k;
    }

    public static int getDigitLength ( int number )
    {
      int digit_length = 0;
      int buffer = number;

      // While loop determines the length of number
      while (number != 0)
      {
          digit_length++;
        	number /= 10;
      }

      return digit_length;
    }
}
