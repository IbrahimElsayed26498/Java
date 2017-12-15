/**
 * Figure 15.3 : CreateTextFile.java
 * Writing data to a sequential text file with class Formatter
 */

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {

    private static Formatter output; // formatter class enables output to go into textfiles

    public static void main(String[] args)
    {
        openFile();
        addRecords();
        closeFile();
    }

    // open file clients.txt
    public static void openFile()
    {
        try
        {
            output = new Formatter("clients.txt"); // open the file clients.txt
        }
        catch(SecurityException security)
        {
            System.err.println("Write Permission Denied. Terminating");
            System.exit(1);
        }
        catch(FileNotFoundException fileNotFound)
        {
            System.err.println("Error Opening File. Terminating");
            System.exit(1);
        }
    }

    // add records to file clients.txt
    public static void addRecords()
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s\n%s\n?",
                "Enter Account Number, First Name, Last Name And balance",
                "Enter End-Of-file Indicator To End Input");

        while (input.hasNext()) // loop until Ctrl-D End-Of-File indicator
        {
            try
            {
                // output new record to file; assumes valid text input
                output.format("%d %s %s %.2f\n", input.nextInt(), input.next(),
                        input.next(), input.nextDouble() );
            }
            catch(FormatterClosedException formatterClosedException)
            {
                System.err.println("Error Writing To File. Terminating");
                break;
            }
            catch(NoSuchElementException elementException)
            {
                System.err.println("Invalid Input. Please Try Again.");
                break;//input.nextLine();
            }

            System.out.print("? ");
        }
    }

    public static void closeFile()
    {
        if (output != null)
            output.close();
    }
}