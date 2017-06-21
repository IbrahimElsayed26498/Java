// GradeBookTest.java

public class GradeBookTest
{
  public static void main (String[] args)
  {
    int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

    GradeBook myGradeBook = new GradeBook("Introduction To Computer Science", gradesArray );

    // Run displayMessage() method on gradeBook1 and gradeBook2 objects
    myGradeBook.displayMessage();
    myGradeBook.processGrades();
  }
}
