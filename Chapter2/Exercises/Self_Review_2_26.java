// Self_Review_2_26
// Program determines if first integer is a multiple of second

import java.util.Scanner;

public class Self_Review_2_26
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);

    int first, second;

    System.out.println("Enter First Integer : ");
    first = input.nextInt();

    System.out.println("Enter Second Integer : ");
    second = input.nextInt();

    if ( first % second == 0 )
      System.out.printf("%d Is A multiple of %d", first, second);
    else
      System.out.printf("%d is not a multiple of %d", first, second);

  }
}
