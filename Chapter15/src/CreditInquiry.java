/**
 * Figure 15.8 : CreditInquiry.java
 * This program reads a file sequentially and displays the contents based on
 * the type of account the user requests(credit balance, debit balance or zero balance)
 */

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CreditInquiry {

    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args)
    {
        // Get user's request
        MenuOption accountType = getRequest();

        while (accountType != MenuOption.END)
        {
            switch (accountType)
            {
                case ZERO_BALANCE:
                    System.out.printf("\nAccounts With Zero Balances\n");
                    break;
                case CREDIT_BALANCE:
                    System.out.printf("\nAccounts With Credit Balances\n");
                    break;
                case DEBIT_BALANCE:
                    System.out.printf("\nAccounts With Debit Balance\n");
                    break;
            }

            readRecords(accountType);
            accountType = getRequest(); // get user's request
        }
    }

    // Obtain request from user
    private static MenuOption getRequest()
    {
        int request = 4;

        // display request options
        System.out.printf("\nEnter Request\n%s\n%s\n%s\n%s\n",
                " 1 - List Accounts With Zero Balances",
                " 2 - List Accounts With Credit Balances",
                " 3 - List Accounts With Debit Balances",
                " 4 - Terminate Program");

        try
        {
            Scanner input = new Scanner(System.in);

            do {

                System.out.printf("\n? ");
                request = input.nextInt();

            } while((request < 1) || (request > 4));
        }
        catch(NoSuchElementException elementException)
        {
            System.err.println("Invalid Input. Terminating");
        }

        return choices[request - 1];
    }

    // Read records from file, displaying only records of appropriate type

    private static void readRecords(MenuOption accountType)
    {
        // open file and process contents
        try (Scanner input = new Scanner(Paths.get("clients.txt")))
        {
            while (input.hasNext())
            {
                int accountNumber = input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();

                // if proper account type, display records
                if (shouldDisplay(accountType, balance))
                    System.out.printf("%-10d%-12s%-12s%10.2f\n", accountNumber,
                            firstName, lastName, balance);
                else
                    input.nextLine();
            }
        }
        catch (NoSuchElementException | IllegalStateException | IOException e)
        {
            System.err.println("Error procesing file.Terminating");
            System.exit(1);
        }
    }

    // use record to determine if record should be displayed
    private static boolean shouldDisplay(MenuOption accountType, double balance)
    {
        if ((accountType == MenuOption.CREDIT_BALANCE) && (balance < 0))
            return true;
        else if ((accountType == MenuOption.DEBIT_BALANCE) && (balance > 0))
            return true;
        else if ((accountType == MenuOption.ZERO_BALANCE) && (balance == 0))
            return true;

        return false;
    }
}