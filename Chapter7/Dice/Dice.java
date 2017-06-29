// Dice.java

import java.util.Random;

public class Dice
{
  public static void main(String[] args)
  {
    int dice1, dice2;

    Random randomOne = new Random();
    Random randomTwo = new Random();

    dice1 = 1 + randomOne.nextInt( 6 );
    dice2 = 1 + randomTwo.nextInt( 6 );

    int result;

    int[][] sum = new int[6][6]; // Two-dimensional array sum

    // Assign all entries of 2D array to zero
    for ( int i = 0; i < 6; i++)
        for ( int j = 0; j < 6; j++)
            sum[i][j] = 0;

    int[] tally = new int[11]; // tally[0] == sum of 2's and tally[9] == sum of 12's

    // Assign all tallies to zero
    for (int k = 0; k < 11; k++ )
        tally[k] = 0;

    double[] percentage = new double[11];

    // Assign all percentage values to zero.zero
    for (int k = 0; k < 11; k++ )
        percentage[k] = 0;

    for ( int roll = 1; roll <= 36000000; roll++)
    {
        result = rollDice();
        //System.out.println(result);

        switch( result )
        {
          case 2:
            tally[0]++;
            break;
          case 3:
            tally[1]++;
            break;
          case 4:
            tally[2]++;
            break;
          case 5:
            tally[3]++;
            break;
          case 6:
            tally[4]++;
            break;
          case 7:
            tally[5]++;
            break;
          case 8:
            tally[6]++;
            break;
          case 9:
            tally[7]++;
            break;
          case 10:
            tally[8]++;
            break;
          case 11:
            tally[9]++;
            break;
          case 12:
            tally[10]++;
            break;
          default:
            System.out.printf("You're Out Of Bounds ! \n");
            break;
        }
    }

    // Compute percentages
    for ( int l = 0; l < 11; l++)
        percentage[l] = tally[l]/ 36000000;


    // Output results
    System.out.println( "Face\tFrequency\tPercentage" ); // output
    System.out.printf( "2\t%d\t\t%.2f\n3\t%d\t\t%.2f\n4\t%d\t\t%.2f\n5\t%d\t\t%.2f\n6\t%d\t\t%.2f\n7\t%d\t\t%.2f\n8\t%d\t\t%.2f\n9\t%d\t\t%.2f\n10\t%d\t\t%.2f\n11\t%d\t\t%.2f\n12\t%d\t\t%.2f\n",
                        tally[0], tally[0]*100/36000000.0, tally[1], tally[1]*100/36000000.0, tally[2], tally[2]*100/36000000.0,
                        tally[3], tally[3]*100/36000000.0, tally[4], tally[4]*100/36000000.0, tally[5], tally[5]*100/36000000.0,
                        tally[6], tally[6]*100/36000000.0, tally[7], tally[7]*100/36000000.0, tally[8], tally[8]*100/36000000.0,
                        tally[9], tally[9]*100/36000000.0, tally[10], tally[10]*100/36000000.0);
  }

  public static int rollDice ()
  {
    int dice1, dice2;

    Random randomOne = new Random();
    Random randomTwo = new Random();

    dice1 = 1 + randomOne.nextInt( 6 );
    dice2 = 1 + randomTwo.nextInt( 6 );

    //System.out.printf("%d + %d = %d\n", dice1, dice2, dice1 + dice2 );

    return dice1 + dice2;
  }
}
