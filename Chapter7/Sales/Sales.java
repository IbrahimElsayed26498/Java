// Sales.java

import java.util.Scanner;

public class Sales
{
  static int products = 5; // Number of products available on sale
  static int salespersons = 4; // Number of salespersons available
  static int week = 7; // Number of days within the week

  public static void main( String[] args )
  {
    System.out.printf(" This program reads and displays monthly information about employees' sales of products \n\n");

    int[][] slip = new int[products][salespersons];
    int[] personTotals = new int[salespersons];
    int[] productTotals = new int[products];
    int grandTotal = 0;

    Scanner input = new Scanner( System.in );

    /* We assume that salespeople sold a fixed amount each day last month */

    System.out.printf("Enter values for sales slips for the month\n\n");

    int j, k;

    for (j = 0; j < products; j++)
    {
      System.out.printf("Sales slips for Product %d \n\n", j + 1);
      for (k = 0; k < salespersons; k++)
      {
        System.out.printf("Salesperson %d ", k + 1 );
        slip[j][k] = input.nextInt() ;
        slip[j][k] *= week; /* Assuming salespeople sold a fixed amount each day */
      }
    }

    System.out.printf("\n\nHere is a summary of the month's sales data\n\n");
    System.out.printf("                       SALESPERSONS\n\n");
    System.out.printf(" PRODUCTS   \n");

    System.out.printf("\t\t");
    for ( k = 0 ; k < salespersons;k++)
    {
        System.out.printf("\tSalesperson %d  ", k + 1);
    }

    System.out.printf("TotalProductSales\n");

    for ( j = 0; j < products; j++)
    {
      System.out.printf(" Product %d\t\t ", j + 1 );

      for ( k = 0; k < salespersons; k++)
      {
          productTotals[j] += slip[j][k];
          System.out.printf("%d \t\t", slip[j][k] );
      }
      System.out.printf("%d \n\n", productTotals[j]);
    }

    for ( k = 0; k < salespersons; k++)
    {
        for (j = 0; j < products;j++)
        {
          personTotals[k] += slip[j][k];
        }
    }
    System.out.printf(" SalesPerPerson      \t");

    for (k = 0; k < salespersons; k++)
    {
        System.out.printf("%d\t\t", personTotals[k] );
        grandTotal += personTotals[k];
    }
    System.out.printf("%d <-------- GRAND TOTAL\n\n", grandTotal );
  }
}
