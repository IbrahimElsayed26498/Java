/**
 * Figure 15.10 : CreateSequentialFile.java
 * Writing objects sequentially to a file with class ObjectOutputStream
 */

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateSequentialFile {

    public static ObjectOutputStream output; // Output data to file

    public static void main(String[] args)
    {
        openFile();
        addRecords();
        closeFile();
    }

    // Open file clients.ser
    public static void openFile(){
       try
       {
           output = new ObjectOutputStream(Files.newOutputStream(Paths.get("clients.ser")));
       }
       catch( IOException ioException)
       {
            System.err.printf("Error Opening File. Terminating");
            System.exit(1);
       }
    }

    // Close file and terminate application
    public static void closeFile()
    {
        try
        {
            if (output != null)
                output.close();
        }
        catch(IOException ioException)
        {
            System.err.printf("Error Closing Files. Terminating");
        }
    }

    // add records to a file
    public static void addRecords()
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s\n%s\n?",
                "Enter account number, first name, last name and balance",
                "Enter EOF indicator to end input.");

        while(input.hasNext())
        {
            try
            {
                // Create new record; this example assumes valid input
                Account record = new Account(input.nextInt(),
                        input.next(), input.next(), input.nextDouble());

                // serialize record object into file
                output.writeObject(record);
            }
            catch(NoSuchElementException elementException)
            {
                System.err.println("Invalid input. Please try again");
                input.nextLine();
            }
            catch(IOException ioException)
            {
                System.err.println("Error writing to file. Terminating");
                break;
            }

            System.out.print("? ");
        }
    }
}