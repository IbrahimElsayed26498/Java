// QualityPoints.java

import java.util.Scanner;

public class QualityPoints
{
  public static void main( String[] args )
  {
    System.out.println("Program Determines The Quality Of Your Score");
    System.out.printf("Enter Your Score On 100\n");

    Scanner input = new Scanner(System.in);
    int score = input.nextInt();

    System.out.printf("Your Quality For Score %d Is %d\n", score, qualityScore( score ));
  }

  public static int qualityScore( int score )
  {
    if (( score >= 90 ) && ( score <= 100 ))
      return 4;
    if ((score >= 80) && ( score < 90) )
      return 3;
    if ((score >= 70) && ( score < 80) )
      return 2;
    if ((score >= 60) && ( score < 70) )
      return 1;
    else
      return 0;

  }
}
