// Self_Review_2_25.java
// Program determines parity of integers

import java.util.Scanner;

public class Self_Review_2_25
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner( System.in );

    int integer;
    System.out.println("Enter An integer : ");
    integer = input.nextInt();

    if ( integer % 2 == 0 )
      System.out.printf("%d Is Even", integer);
    else
      System.out.printf("%d Is Odd", integer);
  }
}
