// SalesTest.java

import java.util.Scanner;

public class SalesTest
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner( System.in );

    double totalSales, earnings = 200.0;

    int item1, item2, item3, item4;

    System.out.println("Enter The Number of Item 1 sold : ");
    item1 = input.nextInt();

    System.out.println("Enter The Number of Item 2 sold : ");
    item2 = input.nextInt();

    System.out.println("Enter The Number of Item 3 sold : ");
    item3 = input.nextInt();

    System.out.println("Enter The Number of Item 4 sold : ");
    item4 = input.nextInt();

    Sales salesman = new Sales( 239.99, 129.75, 99.95, 350.89 );

    totalSales = salesman.getItemOne() * item1 + salesman.getItemTwo() * item2 + salesman.getItemThree() * item3 + salesman.getItemFour() * item4;

    System.out.printf("Your total sales for this week is %.2f\n", totalSales );


    System.out.printf("Your sales earnings for last week is %.2f", earnings );

  }

  public 
}
