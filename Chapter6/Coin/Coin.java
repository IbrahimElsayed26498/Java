// Coin.java

import java.util.Random;

public class Coin
{
  public static void main (String[] args )
  {
  	System.out.println(" This program rolls a coin  6,000,000 times \n");

  	int frequencyHead = 0;
  	int frequencyTail = 0;
  	int side;

  	for (int roll = 1; roll <= 6000000; roll++)
    {
  		side = flip();

  		switch( side )
      {
  			case 1:
  				frequencyTail++;
  				break;
  			case 2:
  				frequencyHead++;
  				break;
  			default:
  				System.out.println(" Program Should Never Get Here !\n");
  		}
  	}

  	System.out.printf("SIDE\tFREQUENCY \n");
  	System.out.printf("Tail\t%d\nHead\t%d", frequencyTail, frequencyHead );
  }

  public static int flip()
  {
    Random randomNumber = new Random();
    int face;
    face = 1 + randomNumber.nextInt(2);
    return face;
  }
}
