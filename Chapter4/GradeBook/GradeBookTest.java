// GradeBookTest.java

import java.util.Scanner;

public class GradeBookTest
{
  public static void main (String[] args)
  {
    GradeBook gradeBook1 = new GradeBook("Introduction To Computer Science", "Dr. Rajan Munitam");

    // Run displayMessage() method on gradeBook1 objects
    gradeBook1.displayMessage();
    gradeBook1.determineClassAverage();
  }
}
