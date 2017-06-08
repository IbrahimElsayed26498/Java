// GradeBookTest.java

import java.util.Scanner;

public class GradeBookTest
{
  public static void main (String[] args)
  {
    GradeBook myGradeBook = new GradeBook();
    /* Create GradeBook object " new GradeBook() "
        and assign it to myGradeBook object */

    Scanner input = new Scanner( System.in );

    System.out.printf("Initial Course Name Is : %s\n", myGradeBook.getCourseName());

    System.out.println("Kindly Enter The Course Name ");
    String theName = input.nextLine();
    myGradeBook.setCourseName( theName );
    System.out.println();

    myGradeBook.displayMessage( ); // Run displayMessage() method on myGradeBook object
  }
}
