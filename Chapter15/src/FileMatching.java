/**
 * Exercise 15.4 : FileMatching.java
 */

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Formatter;

public class FileMatching {

    private static Formatter outputOne;
    private static Formatter outputTwo;
    private static Formatter outputThree;
    private static Formatter outputFour;
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

    // open old master file for writing
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

    // open old master file for reading
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

    // open new master file for writing
    public static void openNewMasterFileForWriting()
    {
        try
        {
            outputThree = new Formatter("newMast.txt");
            //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));
        }
        catch(IOException ioException)
        {
            System.err.printf("Error opening file");
            System.exit(1);
        }
    }

    // open log file for writing
    public static void openLogFileForWriting()
    {
        try
        {
            outputFour = new Formatter("log.txt");
            //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));
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

    // check matching records
    public static void checkMatch()
    {
        try
        {
            while(inputOne.hasNext())
            {
                Account masterRecord = new Account( inputOne.nextInt(), inputOne.next(), inputOne.next(), inputOne.nextDouble());

                while(inputTwo.hasNext())
                {
                    TransactionRecord transactionRecord = new TransactionRecord(inputTwo.nextInt(), inputTwo.nextDouble());

                    // matching record occurs
                    if (masterRecord.getAccount() == transactionRecord.getAccountNumber())
                    {
                        masterRecord.setBalance( masterRecord.getBalance() + transactionRecord.getAmount());

                        // Write masterRecord to newMast.txt
                        try //(Scanner input = new Scanner(Paths.get("newMast.txt")))
                        {
                            while(inputTwo.hasNext())
                            {
                                outputThree.format("%d %s %s %.2f", masterRecord.getAccount(), masterRecord.getFirstName(),
                                        masterRecord.getLastName(), masterRecord.getBalance());
                            }
                        }
                        catch(NoSuchElementException | IllegalStateException error)
                        {
                            System.err.println("Error processing file.");
                            System.exit(1);
                        }
                    }
                    else if ((masterRecord.getAccount() != 0) && ( masterRecord.getAccount() != transactionRecord.getAccountNumber()))
                    {
                        // Write masterRecord to newMast.txt
                        try //(Scanner input = new Scanner(Paths.get("newMast.txt")))
                        {
                            while(inputTwo.hasNext())
                            {
                                outputThree.format("%d %s %s %.2f", masterRecord.getAccount(), masterRecord.getFirstName(),
                                        masterRecord.getLastName(), masterRecord.getBalance());
                            }
                        }
                        catch(NoSuchElementException | IllegalStateException error)
                        {
                            System.err.println("Error processing file.");
                            System.exit(1);
                        }
                    }
                    else if ((transactionRecord.getAccountNumber() != 0) && (transactionRecord.getAccountNumber() != masterRecord.getAccount()))
                    {
                        outputFour.format("\nUnmatched transaction record for account number %d\n", transactionRecord.getAccountNumber() );
                    }
                }
            }
        }
        catch(NoSuchElementException elementException)
        {
            System.err.println("File improperly formed. Terminating.");
        }
    }

    // close old Master file after writing
    public static void closeMasterFileAfterWriting()
    {
        //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));

        if (outputOne != null)
            outputOne.close();
    }

    // close old Master file after reading
    public static void closeMasterFileAfterReading()
    {
        //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));

        if (inputOne != null)
            inputOne.close();
    }

    // close new Master file after writing
    public static void closeNewMasterFileAfterWriting()
    {
        //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));

        if (outputThree != null)
            outputThree.close();
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

    // close log file after writing
    public static void closeLogFileAfterWriting()
    {
        //ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.txt")));

        if (outputFour != null)
            outputFour.close();
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

        System.out.printf("\nRead Records From Master & Transaction Files To Compare\n\n");

        // open master and transaction files for reading
        openMasterFileForReading();
        openTransactionFileForReading();

        // open new master file for writing
        openNewMasterFileForWriting();

        // open log file for writing
        openLogFileForWriting();

        // Check Matching records
        checkMatch();

        // close master and transaction files after reading
        closeMasterFileAfterReading();
        closeTransactionFileAfterReading();

        // close new master file after writing
        closeNewMasterFileAfterWriting();

        // close log file after writing
        closeLogFileAfterWriting();
    }
}