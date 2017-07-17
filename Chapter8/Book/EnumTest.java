// EnumTest.java

import java.util.EnumSet;

public class EnumTest
{
  public static void main( String[] args )
  {
    System.out.println("All Books: \n");

    // print all books in enum Book
    for ( Book book : Book.values() )
        System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear() );

    System.out.println("\nDisplay A Range Of Enum Constants: \n");

    // Print first four Books

    for ( Book book : EnumSet.range( Book.JHTP, Book.CPPHTP ) )
        System.out.printf("%-10s%-45s%s\n", book, book.getTitle(), book.getCopyrightYear());
  }
}
