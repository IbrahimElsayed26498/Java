// Tax.java

import java.util.Scanner;

public class Tax
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner ( System.in );
    System.out.println("Program Computes A Citizen's Fair Tax");

    double housing = 0, food = 0, clothing = 0, transportation = 0, education = 0, healthCare = 0, vacation = 0 ;
    double totalExpenses = 0;

    for (  int expenseType = 1; expenseType <= 7; expenseType++)
    {

      switch ( expenseType )
      {
        case 1:
          {
            System.out.printf("You're Entering Expenses For Housing\n");
            System.out.printf("Enter Housing Expenses : ");
            housing = input.nextDouble();
            totalExpenses += housing;
          }
          break;
        case 2:
          {
            System.out.printf("You're Entering Expenses For Food\n");
            System.out.printf("Enter Food Expenses : ");
            food = input.nextDouble();
            totalExpenses += food;
          }
          break;
        case 3:
          {
            System.out.printf("You're Entering Expenses For Clothing\n");
            System.out.printf("Enter Clothing Expenses : ");
            clothing = input.nextDouble();
            totalExpenses += clothing;
          }
          break;
        case 4:
          {
            System.out.printf("You're Entering Expenses For Transportation\n");
            System.out.printf("Enter Transportation Expenses : ");
            transportation = input.nextDouble();
            totalExpenses += transportation;
          }
          break;
        case 5:
          {
            System.out.printf("You're Entering Expenses For Education\n");
            System.out.printf("Enter Education Expenses : ");
            education = input.nextDouble();
            totalExpenses += education;
          }
          break;
        case 6:
          {
            System.out.printf("You're Entering Expenses For Health Care\n");
            System.out.printf("Enter Health Care Expenses : ");
            healthCare = input.nextDouble();
            totalExpenses += healthCare;
          }
          break;
        case 7:
          {
            System.out.printf("You're Entering Expenses For Vacation\n");
            System.out.printf("Enter Vacation Expenses : ");
            vacation = input.nextDouble();
            totalExpenses += vacation;
          }
          break;
        default:
          System.out.println("Enter An Integer In Range 1, 7");
          break;
        }
      }

      System.out.printf("\n\nYour Total Expenses = $%.2f\nFair Tax = $%.2f\n", totalExpenses, 0.23 * totalExpenses );

  }
}
