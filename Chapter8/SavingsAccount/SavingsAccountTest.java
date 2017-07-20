// SavingsAccountTest.java

import java.util.Scanner;

public class SavingsAccountTest
{
  public static void main(String[] args)
  {
    double[] initialMonthlyInterestOne = new double[12];
    double[] finalMonthlyInterestOne = new double[12];
    double[] initialMonthlyInterestTwo = new double[12];
    double[] finalMonthlyInterestTwo = new double[12];

    SavingsAccount saverOne = new SavingsAccount(0.03, 2000 );
    SavingsAccount saverTwo = new SavingsAccount(0.03, 3000 );

    saverOne.setAnnualInterestRate(0.04);
    saverTwo.setAnnualInterestRate(0.04);

    System.out.printf("\nIntial Monthly Interest For \n\t\tFirst Customer\t\tSecond Customer\n");

    for ( int i = 0; i < 12; i++)
    {
      initialMonthlyInterestOne[i] = saverOne.calculateMonthlyInterest();
      initialMonthlyInterestTwo[i] = saverTwo.calculateMonthlyInterest();
      System.out.printf("Month %d : \t%.2f\t\t\t%.2f\n",
                  i + 1, initialMonthlyInterestOne[i], initialMonthlyInterestTwo[i] );
    }

    saverOne.setAnnualInterestRate(0.05);
    saverTwo.setAnnualInterestRate(0.05);

    System.out.printf("Final Monthly Interest For \n\t\tFirst Customer\t\tSecond Customer\n");

    for ( int i = 0; i < 12; i++)
    {
      finalMonthlyInterestOne[i] = saverOne.calculateMonthlyInterest();
      finalMonthlyInterestTwo[i] = saverTwo.calculateMonthlyInterest();
      System.out.printf("Month %d : \t%.2f\t\t\t%.2f\n",
                  i + 1, finalMonthlyInterestOne[i], finalMonthlyInterestTwo[i] );
    }
  }
}
