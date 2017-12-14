/**
 * Figure 15.2 : FileAndDirectoryInfo.java
 * File class used to obtain file and directory information.
 */

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);

        //Create Path object based on user input\
        System.out.printf("\nPlease Enter A Path\n");

        Path path = Paths.get(input.nextLine());

        if (Files.exists(path)) // if path exists, output info about it
        {
            // display files (or directory) information
            System.out.printf("\n%s Exists \n", path.getFileName());
            System.out.printf("\n%s A Directory \n", Files.isDirectory(path) ? "Is" : "Is Not");
            System.out.printf("\n%s An Absolute Path\n", path.isAbsolute() ? "Is" : "Is Not");
            System.out.printf("\nLast Modified : %s \n", Files.getLastModifiedTime(path));
            System.out.printf("\nSize : %s\n", Files.size(path));
            System.out.printf("\nPath : %s\n", path );
            System.out.printf("\nAbsolute Path : %s\n", path.toAbsolutePath());

            if (Files.isDirectory(path))
            {
                System.out.printf("\nDirectory Contents : \n");

                // Object for iterating through a directory' contents
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream)
                    System.out.println(p);
            }
        }
        else // not file or directory, output an error message
        {
            System.out.printf("%s Does Not Exist\n", path);
        }
    } // end main
} // end class FileAndDirectoryInfo
