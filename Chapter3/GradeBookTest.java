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

    System.out.println("Kindly Enter The Course's Name : ");
    String nameOfCourse = input.nextLine();
    System.out.println();

    myGradeBook.displayMessage( nameOfCourse ); // Run displayMessage() method on myGradeBook object
  }
}
