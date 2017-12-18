/**
 * Exercise 15.4 : FileMatching.java
 */
import java.awt.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Formatter;

public class FileMatching {

    private static Formatter outputOne;
    private static Formatter outputTwo;
    private static Scanner inputOne;
    private static Scanner inputTwo;

    // Define class TransactionRecord
    public static class TransactionRecord
    {
        int accountNumber;
        double amount;

        public TransactionRecord(int accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }

    // Define class Account
    public static class Account implements Serializable
    {

        private int account;
        private String firstName;
        private String lastName;
        private double balance;

        // initialise Account with default arguments
        public Account()
            {
                this(0, "", "", 0.0);
            }

        public Account(int account, String firstName, String lastName, double balance)
        {
            this.account = account;
            this.firstName = firstName;
            this.lastName = lastName;
            this.balance = balance;
        }

        public int getAccount() {
                return account;
            }

        public void setAccount(int account) {
                this.account = account;
            }

        public String getFirstName() {
                return firstName;
            }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

        public String getLastName() {
                return lastName;
            }

        public void setLastName(String lastName) {
                this.lastName = lastName;
            }

        public double getBalance() {
                return balance;
            }

        public void setBalance(double balance) {
                this.balance = balance;
            }

        public double combine(TransactionRecord t)
        {
            return this.getBalance() + t.getAmount();
        }
    }

    // open master file for writing
    public static void openMasterFileForWriting()
    {
        try
        {
            outputOne = new Formatter("oldMast.txt");
            //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));
        }
        catch(IOException ioException)
        {
            System.err.printf("Error opening file");
            System.exit(1);
        }
    }

    // open master file for reading
    public static void openMasterFileForReading()
    {
        try
        {
            inputOne = new Scanner(Paths.get("oldMast.txt"));
            //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));
        }
        catch(IOException ioException)
        {
            System.err.printf("Error opening file");
            System.exit(1);
        }
    }

    // open transactions file for writing
    public static void openTransactionFileForWriting()
    {
        try
        {
            outputTwo = new Formatter("trans.txt");
            //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.txt")));
        }
        catch(IOException ioException)
        {
            System.err.printf("Error opening file");
            System.exit(1);
        }
    }

    // open transactions file for reading
    public static void openTransactionFileForReading()
    {
        try
        {
            inputTwo = new Scanner(Paths.get("trans.txt"));
            //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.txt")));
        }
        catch(IOException ioException)
        {
            System.err.printf("Error opening file");
            System.exit(1);
        }
    }

    // add records to master file
    public static void addRecordsToMaster()
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s\n%s\n", "Enter Account Number, First Name, Last Name, Balance", "Enter EOF Indicator To End");

        while(input.hasNext())
        {
            try
            {
                //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));
                //Account record = new Account(input.nextInt(), input.next(), input.next(), input.nextDouble());
                outputOne.format("%d %s %s %.2f\n", input.nextInt(), input.next(), input.next(), input.nextDouble() );
            }
            catch(NoSuchElementException elementException)
            {
                System.err.printf("Invalid input. please try again");
                input.nextLine();
            }
            /*catch(IOException ioException)
            {
                System.err.printf("Error writing to file");
                break;
            }*/
        }

        System.out.printf(" ? ");
    }

    //Read records from master file
    public static void readRecordsFromMaster()
    {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");

        try
        {
            while(inputOne.hasNext())
            {
                // Display record contents
                System.out.printf("%-10d%-12s%-12s%10.2f\n", inputOne.nextInt(), inputOne.next(), inputOne.next(), inputOne.nextDouble());
            }
        }
        catch(NoSuchElementException elementException)
        {
            System.err.println("File improperly formed. Terminating.");
        }
        catch(IllegalStateException illegalState)
        {
            System.err.println("Error reading from file. Terminating.");
        }
    }

    // add records to transactions file
    public static void addTransactionRecords()
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s\n%s\n", "Enter Account Number and Transaction Amount", "Enter EOF Indicator To End");

        while(input.hasNext())
        {
            try
            {
                //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.txt")));
                //TransactionRecord transactionRecord = new TransactionRecord(input.nextInt(), input.nextDouble());
                outputTwo.format("%d %.2f\n", input.nextInt(), input.nextDouble() );//writeObject(transactionRecord);
            }
            catch(NoSuchElementException elementException)
            {
                System.err.printf("Invalid input. please try again");
                input.nextLine();
            }
            /*catch(IOException ioException)
            {
                System.err.printf("Error writing to file");
                break;
            }*/
        }

        System.out.printf(" ? ");
    }

    //Read records from transaction file
    public static void readRecordsFromTransaction()
    {
        System.out.printf("%s   %s\n", "Account", "Transaction Amount");

        try
        {
            while(inputTwo.hasNext())
            {
                // Display record contents
                System.out.printf("%-14d %13.2f\n", inputTwo.nextInt(), inputTwo.nextDouble());
            }
        }
        catch(NoSuchElementException elementException)
        {
            System.err.println("File improperly formed. Terminating.");
        }
        catch(IllegalStateException illegalState)
        {
            System.err.println("Error reading from file. Terminating.");
        }
    }

    // close Master file after writing
    public static void closeMasterFileAfterWriting()
    {
        //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));

        if (outputOne != null)
            outputOne.close();
    }

    // close Master file after reading
    public static void closeMasterFileAfterReading()
    {
        //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));

        if (inputOne != null)
            inputOne.close();
    }

    // close Transaction file after writing
    public static void closeTransactionFileAfterWriting()
    {
        //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.txt")));

        if (outputTwo != null)
            outputTwo.close();
    }

    // close Transaction file after reading
    public static void closeTransactionFileAfterReading()
    {
        //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.txt")));

        if (inputTwo != null)
            inputTwo.close();
    }

    public static void main(String[] args)
    {
        System.out.printf("\nAdd Records To Master File oldMast.txt\n\n");

        // Open Master File for writing
        openMasterFileForWriting();

        // Add records to master file
        addRecordsToMaster();

        // Close Master file
        closeMasterFileAfterWriting();

        System.out.printf("\nAdd Records To Transaction File trans.txt\n\n");

        // Open Transaction File for writing
        openTransactionFileForWriting();

        // Add records to transactions file
        addTransactionRecords();

        // Close transactions file
        closeTransactionFileAfterWriting();

        System.out.printf("\nRead Records From Master File oldMast.txt\n\n");

        // Open master file for reading
        openMasterFileForReading();

        // Read from master files
        readRecordsFromMaster();

        // Close master file
        closeMasterFileAfterReading();

        System.out.printf("\nRead Records From Transaction File trans.txt\n\n");

        // Open transaction file for reading
        openTransactionFileForReading();

        // Read from transaction files
        readRecordsFromTransaction();

        // Close Transaction file after reading
        closeTransactionFileAfterWriting();
    }
}