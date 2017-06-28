// Product.java

import java.util.Scanner;

public class Product
{
  public static void main(String[] args)
  {
    System.out.println("Enter A Pentuple");

    Scanner input = new Scanner(System.in);

    int[] p = new int[2];

    int d1, d2, d3, d4, d5;

    System.out.printf("Integer 1 : " );
    d1 = input.nextInt();

    System.out.printf("Integer 2 : " );
    d2 = input.nextInt();

    System.out.printf("Integer 3 : " );
    d3 = input.nextInt();

    System.out.printf("Integer 4 : " );
    d4 = input.nextInt();

    System.out.printf("Integer 5 : " );
    d5 = input.nextInt();

    p[0] = product(d1, d2, d3, d4, d5 );

    System.out.printf("The product of %d, %d, %d, %d and %d Is %d\n", d1, d2, d3, d4, d5, p[0]);

    int c1, c2, c3, c4, c5, c6, c7;

    System.out.printf("Integer 1 : " );
    c1 = input.nextInt();

    System.out.printf("Integer 2 : " );
    c2 = input.nextInt();

    System.out.printf("Integer 3 : " );
    c3 = input.nextInt();

    System.out.printf("Integer 4 : " );
    c4 = input.nextInt();

    System.out.printf("Integer 5 : " );
    c5 = input.nextInt();

    System.out.printf("Integer 4 : " );
    c6 = input.nextInt();

    System.out.printf("Integer 5 : " );
    c7 = input.nextInt();

    p[1] = product(c1, c2, c3, c4, c5, c6, c7 );

    System.out.printf("The product of %d, %d, %d, %d, %d, %d and %d Is %d\n", c1, c2, c3, c4, c5, c6, c7, p[1]);

  }

  public static int product(int... series )
  {
    int pdt = 1;

    for ( int d : series )
      pdt *= d;

    return pdt;
  }
}
