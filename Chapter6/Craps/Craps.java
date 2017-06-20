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
      int bankBalance = 1000;
    	int wager;

      Scanner input = new Scanner( System.in );

    	do
      {
    		System.out.println("Enter An Integer For A Wager : " );
    		wager = input.nextInt();

    	} while ( wager > bankBalance );

    	Status current = gameOfCrabs();

    	if ( current == Status.WON )
      {
    		bankBalance += wager;
    		System.out.println(" Bank Balance : " + bankBalance );
    		if ( bankBalance >= 1100 )
    			System.out.println("You're Up Big ! Keep it going !");
    		if ( bankBalance >= 1500 )
    			System.out.println("You're making enormous progress !" );
    	}
    	else
      {
    		bankBalance -= wager;
    		System.out.println(" Bank Balance : " + bankBalance );
    		if (bankBalance <= 100 )
    			System.out.println( "Careful ! You're headed for broke !");
    		if ( bankBalance == 0)
    			System.out.println("Sorry ! You're Busted ! ");
    	}
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
