// Self_Review_2_24.java
// Finds the largest and smallest Number within a set of five integers

import java.util.Scanner;

public class Self_Review_2_24
{
  public static void main(String[] args)
  {
    System.out.println("This program finds the largest and smallest integer from a quintuple");

    int first, second, third, fourth, fifth;
    int small, large;

    Scanner input = new Scanner( System.in );

    System.out.println("Enter First Integer : ");
    first = input.nextInt();

    System.out.println("Enter Second Integer : ");
    second = input.nextInt();

    System.out.println("Enter Third Integer : ");
    third = input.nextInt();

    System.out.println("Enter Fourth Integer : ");
    fourth = input.nextInt();

    System.out.println("Enter Fifth Integer : ");
    fifth = input.nextInt();

    small = first;
    if (second <= small)
      small = second;
    if (third <= small)
      small = third;
    if (fourth <= small)
      small = fourth;
    if (fifth <= small)
      small = fifth;

    large = fifth;
    if (second >= large)
        large = second;
    if (third >= large)
        large = third;
    if (fourth >= large)
        large = fourth;
    if (fifth >= large)
        large = fifth;

    System.out.printf("The largest integer amongst %d, %d, %d, %d and %d is %d\n", first, second, third, fourth, fifth, large);
    System.out.printf("The smallest integer amongst %d, %d, %d, %d and %d is %d\n", first, second, third, fourth, fifth, small);






  }
}
