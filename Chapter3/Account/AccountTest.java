// AccountTest.java

import java.util.Scanner;

public class AccountTest
{
  public static void main(String[] args)
  {
    Account account1 = new Account( 50.00 );
    Account account2 = new Account( -7.11 );

    System.out.printf(" account1 balance = %.2f\n", account1.getBalance() );
    System.out.printf(" account2 balance = %.2f\n", account2.getBalance() );

    Scanner input = new Scanner (System.in);
    double depositAmount;
    double withdrawalAmount;

    System.out.printf(" Enter An Amount to deposit in account1 \n");
    depositAmount = input.nextDouble();
    System.out.println();

    System.out.printf("Adding %.2f to account1 balance \n", depositAmount);
    account1.credit(depositAmount);

    System.out.printf(" account1 balance = %.2f\n", account1.getBalance() );
    System.out.printf(" account2 balance = %.2f\n", account2.getBalance() );

    System.out.printf(" Enter An Amount to deposit in account2 \n");
    depositAmount = input.nextDouble();
    System.out.println();

    System.out.printf("Adding %.2f to account2 balance \n", depositAmount);
    account2.credit(depositAmount);

    System.out.printf(" account1 balance = %.2f\n", account1.getBalance() );
    System.out.printf(" account2 balance = %.2f\n", account2.getBalance() );

    System.out.printf(" Enter An Amount to withdraw from account1 \n");
    withdrawalAmount = input.nextDouble();
    System.out.println();

    System.out.printf("Reducing %.2f from account1 balance \n", withdrawalAmount );
    account1.debit( withdrawalAmount );

    System.out.printf(" account1 balance = %.2f\n", account1.getBalance() );
    System.out.printf(" account2 balance = %.2f\n", account2.getBalance() );

    System.out.printf(" Enter An Amount to withdraw from account2 \n");
    withdrawalAmount = input.nextDouble();
    System.out.println();

    System.out.printf("Reducing %.2f from account2 balance \n", withdrawalAmount );
    account2.debit( withdrawalAmount );

    System.out.printf(" account1 balance = %.2f\n", account1.getBalance() );
    System.out.printf(" account2 balance = %.2f\n", account2.getBalance() );

  }
}
