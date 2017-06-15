// Sales.java
// Program Calculates Smallest

import java.util.Scanner;

public class Sales
{
  public static void main(String[] args)
  {
    double[] sales = new double[5];

    Scanner input = new Scanner(System.in);

    for (int times = 1; times <= 5; times++)
    {
      System.out.printf("Enter Positive Number For Quantity : ");
      int quantity = input.nextInt();

      System.out.printf("Enter Product Number in [1,5] : ");
      int productNumber = input.nextInt();

      switch ( productNumber )
      {
        case 1:
          {
            sales[0] += 2.98 * quantity ;
          }
          break;
        case 2:
          {
            sales[1] += 4.50 * quantity ;
          }
          break;
        case 3:
          {
            sales[2] += 9.98 * quantity;
          }
          break;
        case 4:
          {
            sales[3] += 4.49 * quantity;
          }
          break;
        case 5:
          {
            sales[4] += 6.87 * quantity;
          }
          break;
        default:
          System.out.println("Wrong Number!");
          break;
        }
      }

    System.out.printf("Total Revenue is %.1f\n", sales[0] + sales[1] + sales[2] + sales[3] + sales[4]);
  }
}
