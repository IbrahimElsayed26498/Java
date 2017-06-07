// Self_Review_2_32.java
// Finds the number of integers in R-, {0} and R+

import java.util.Scanner;

public class Self_Review_2_32
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);

    int first, second, third, fourth, fifth;
    int positive = 0, zero = 0, negative = 0;

    System.out.println("Enter First Integer : ");
    first = input.nextInt();
    if ( first < 0)
      negative++;
    else {
          if (first == 0)
            zero++;
          else
            positive++;
        }

    System.out.println("Enter Second Integer : ");
    second = input.nextInt();
    if ( second < 0)
      negative++;
    else {
          if (second == 0)
            zero++;
          else
            positive++;
        }

    System.out.println("Enter Third Integer : ");
    third = input.nextInt();
    if ( third < 0)
      negative++;
    else {
          if (third == 0)
            zero++;
          else
            positive++;
        }

    System.out.println("Enter Fourth Integer : ");
    fourth = input.nextInt();
    if ( fourth < 0)
      negative++;
    else {
          if (fourth == 0)
            zero++;
          else
            positive++;
        }

    System.out.println("Enter Third Integer : ");
    fifth = input.nextInt();
    if ( fifth < 0)
      negative++;
    else {
          if (fifth == 0)
            zero++;
          else
            positive++;
        }

    System.out.printf("Number of postives = %d\nNumber of zeroes = %d\nNumber of negatives = %d", positive, zero, negative);
  }
}
