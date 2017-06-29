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

         System.out.printf("Number Of WINS\t %d \nNumber Of LOSSES %d\n", winningChances/columns, lossingChances/columns );
         System.out.printf("Your chances of winning Game of Craps Is %.2f\n", winningChances /columns * 1.0  );

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
}
