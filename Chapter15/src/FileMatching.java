/**
 * Exercise 15.4 : FileMatching.java
 */
import java.awt.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileMatching {

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

    // open master file
    public static void openMasterFile()
    {
        try
        {
            ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));
        }
        catch(IOException ioException)
        {
            System.err.printf("Error opening file");
            System.exit(1);
        }
    }

    // open transactions file
    public static void openTransactionFile()
    {
        try
        {
            ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.txt")));
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
                ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));
                Account record = new Account(input.nextInt(), input.next(), input.next(), input.nextDouble());
                output.writeObject(record);
            }
            catch(NoSuchElementException elementException)
            {
                System.err.printf("Invalid input. please try again");
                input.nextLine();
            }
            catch(IOException ioException)
            {
                System.err.printf("Error writing to file");
                break;
            }
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
                ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.txt")));
                TransactionRecord transactionRecord = new TransactionRecord(input.nextInt(), input.nextDouble());
                output.writeObject(transactionRecord);
            }
            catch(NoSuchElementException elementException)
            {
                System.err.printf("Invalid input. please try again");
                input.nextLine();
            }
            catch(IOException ioException)
            {
                System.err.printf("Error writing to file");
                break;
            }
        }

        System.out.printf(" ? ");
    }

    // close Master file
    public static void closeMasterFile()
    {
        try
        {
            ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.txt")));

            if (output != null)
                output.close();
        }
        catch (IOException ioException)
        {
            System.err.printf("Error closing file ");
            System.exit(1);
        }
    }

    // close Transaction file
    public static void closeTransactionFile()
    {
        try
        {
            ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.txt")));

            if (output != null)
                output.close();
        }
        catch (IOException ioException)
        {
            System.err.printf("Error closing file ");
            System.exit(1);
        }
    }

    public static void main(String[] args)
    {
        System.out.printf("\nTime To Add Records To Master File oldMast.txt\n");
        openMasterFile();
        addRecordsToMaster();
        closeMasterFile();

        System.out.printf("\nTime To Add Records To Transaction File trans.txt\n");
        openTransactionFile();
        addTransactionRecords();
        closeTransactionFile();
    }
}
