// AccountTest.java

import java.util.Scanner;

public class AccountTest
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner (System.in);

    Account sample = new Account(0, 0, 0, 0, 0);

    int account, balBF, items, charge, limit;

    System.out.print( "Enter Account Number : ");
    sample.setAccountNumber( input.nextInt());

    System.out.print( "Enter Initial Balance : ");
    sample.setBalanceBF( input.nextFloat());

    System.out.print( "Enter Items Charged : ");
    sample.setItemsCharged( input.nextInt());

    System.out.print( "Enter Credits Applied : ");
    sample.setCreditsApplied( input.nextInt());

    System.out.print( "Enter Credit Limit : ");
    sample.setCreditLimit( input.nextInt());

    sample.setBalanceBF( sample.getBalanceBF() + sample.getItemsCharged() + sample.getCreditsApplied() );

    System.out.printf(" Account Number : %d\n", sample.getAccountNumber());
    System.out.printf(" Inital Balance : %.2f\n", sample.getBalanceBF());
    System.out.printf(" Items Charged : %d\n", sample.getItemsCharged());
    System.out.printf(" Credits Applied : %d\n", sample.getCreditsApplied());
    System.out.printf(" Credit Limit : %d\n", sample.getCreditLimit());

  }
}
