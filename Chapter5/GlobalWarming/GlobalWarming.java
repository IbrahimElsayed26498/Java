// GlobalWarming.java

import java.util.Scanner;

public class GlobalWarming
{
  public static void main(String[] args)
  {
    System.out.println("This Program Tests Your Knowledge On Global Warming And Climate Change");

    Scanner input = new Scanner( System.in );

    int correctAnswers = 0, wrongAnswer = 0;

    int answer;

    System.out.printf("\n\nQuestion 1 : Which Movie Publicized Global Warming The Most ? \n\n");
    System.out.printf("1. Avatar \n2. An Inconvinient Truth \n3. Star Wars\n4.Shell Knew\n");

    System.out.printf("\nEnter Your Answer [ 1, 2, 3 Or 4 ] : ");
    answer = input.nextInt();

    switch( answer )
    {
      case 1:
        wrongAnswer++;
        break;
      case 2:
        correctAnswers++;
        break;
      case 3:
        wrongAnswer++;
        break;
      case 4:
        wrongAnswer++;
        break;
      default:
        System.out.println("Enter A Integer In [1,4] Interval");
        break;
    }

    System.out.printf("\n\nQuestion 2 : Which Accounts For Global Warming Emissions From Using Synthetic Fertilizers ? \n\n");
    System.out.printf("1. Manufacturing \n2. Transportation \n3. Overuse \n4. All The Above\n");

    System.out.printf("\nEnter Your Answer [ 1, 2, 3 Or 4 ] : ");
    answer = input.nextInt();

    switch( answer )
    {
      case 1:
        wrongAnswer++;
        break;
      case 2:
        wrongAnswer++;
        break;
      case 3:
        correctAnswers++;
        break;
      case 4:
        wrongAnswer++;
        break;
      default:
        System.out.println("Enter A Integer In [1,4] Interval");
        break;
    }

    System.out.printf("\n\nQuestion 3 : Which Is A Greenhouse Gaz ? \n\n");
    System.out.printf("1. Carbonic Acid \n2. Carbon Dioxide \n3. Carbon Monoxide \n4. Nitrous Dioxide\n");

    System.out.printf("\nEnter Your Answer [ 1, 2, 3 Or 4 ] : ");
    answer = input.nextInt();

    switch( answer )
    {
      case 1:
        wrongAnswer++;
        break;
      case 2:
        wrongAnswer++;
        break;
      case 3:
        correctAnswers++;
        break;
      case 4:
        wrongAnswer++;
        break;
      default:
        System.out.println("Enter A Integer In [1,4] Interval");
        break;
    }

    System.out.printf("\n\nQuestion 4 : __________________ Can Cause Global Warming ? \n\n");
    System.out.printf("1. Volcanoes \n2. Trees Growing \n3. Fish Swimming \n4. MudSlides\n");

    System.out.printf("\nEnter Your Answer [ 1, 2, 3 Or 4 ] : ");
    answer = input.nextInt();

    switch( answer )
    {
      case 1:
        correctAnswers++;
        break;
      case 2:
        wrongAnswer++;
        break;
      case 3:
        wrongAnswer++;
        break;
      case 4:
        wrongAnswer++;
        break;
      default:
        System.out.println("Enter A Integer In [1,4] Interval");
        break;
    }

    System.out.printf("\n\nQuestion 5 : Which Country Emits The Most Greenhouse Gazes ? \n\n");
    System.out.printf("1. India \n2. China \n3. United Kingdom \n4. United States\n");

    System.out.printf("\nEnter Your Answer [ 1, 2, 3 Or 4 ] : ");
    answer = input.nextInt();

    switch( answer )
    {
      case 1:
        wrongAnswer++;
        break;
      case 2:
        correctAnswers++;
        break;
      case 3:
        wrongAnswer++;
        break;
      case 4:
        wrongAnswer++;
        break;
      default:
        System.out.println("Enter A Integer In [1,4] Interval");
        break;
    }
    System.out.printf("You have %d correct Answers Out Of 5\n", correctAnswers);

    if ( correctAnswers == 5 )
      System.out.println("Excellent Knowledge Of Global Warming");

    if ( correctAnswers == 4)
      System.out.println("Very Good Knowledge Of Global Warming");

    if ( correctAnswers <= 3 )
      System.out.printf("\nYou Need To Brush Up Your Knowledge On Global Warming.\n More here https://www.proprofs.com/quiz-school/topic/global-warming");

  }
}
