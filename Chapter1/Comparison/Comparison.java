// Comparison.Java
// Compare integers using if statements, relational & equality operators

import java.util.Scanner; // Use the Scanner class

public class Comparison
{
  public static void main( String[] args)
  {
    Scanner input = new Scanner ( System.in );

    int first;
    int second;

    System.out.print("Enter First Integer : ");
    first = input.nextInt();

    System.out.print("Enter Second Integer : ");
    second = input.nextInt();

    if (first == second )
      System.out.printf("%d Is Equal To %d\n", first, second);

    if (first != second )
      System.out.printf("%d Is Not Equal To %d\n", first, second);

    if ( first > second)
      System.out.printf("%d Is Greater Than %d\n", first, second);

    if ( first <= second )
      System.out.printf("%d Less Than Or Equal To %d\n", first, second);
  }
}
