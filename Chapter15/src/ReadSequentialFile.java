/**
 * Fig. 15.11: ReadSequentialFile.java
 * Reading a file of objects sequentially with ObjectInputStream
 * and displaying each record
 */

import java.io.IOException;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {

    public static ObjectInputStream input;

    public static void main(String[] args)
    {
        openFile();
        readRecords();
        closeFile();
    }

    // Enable user to select file to open
    public static void openFile()
    {
        try // try to open file
        {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("clients.ser")));
        }
        catch(IOException ioException)
        {
            System.err.printf("Error opening file");
            System.exit(1);
        }
    }

    // read record from file
    public static void readRecords()
    {
       System.out.printf("%-10s%-12s%-12s%10s\n", "Account",
               "First Name", "Last Name", "Balance" );

       try
       {
           while(true){
               Account record = (Account) input.readObject();

               // Display record contents
               System.out.printf("%-10d%-12s%-12s%10.2f\n",
                       record.getAccount(), record.getFirstName(),
                       record.getLastName(), record.getBalance());
           }
       }
       catch(EOFException endOfFileException)
       {
           System.out.printf("\nNo More Records\n");
       }
       catch(ClassNotFoundException classNotFoundException)
       {
           System.err.println("Invalid Object Type. Terminating");
       }
       catch(IOException ioException)
       {
           System.err.println("Error reading from file. Terminating");
       }
    }

    // close file and terminate application
    public static void closeFile()
    {
        try
        {
            if (input != null)
               input.close();
        }
        catch( IOException ioException )
        {
            System.err.printf("Error Closing File. Terminating");
            System.exit(1);
        }
    }

}
