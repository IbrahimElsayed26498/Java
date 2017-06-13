// GradeBook.java

import java.util.Scanner;

public class GradeBook
{
  private String courseName;
  private String instructorName;
  private int total; // sum of grades
  private int gradeCounter; // number of grades entered
  private int aCount; // count of A grades
  private int bCount; // count of B grades
  private int cCount; // count of C grades
  private int dCount; // count of D grades
  private int fCount; // count of F

  public GradeBook( String name, String instructor )
  {
    setCourseName( name );
    setInstructorName( instructor );
  }

  public void setCourseName( String name )
  {
    courseName = name;
  }

  public String getInstructorName()
  {
    return instructorName;
  }

  public void setInstructorName( String instructor )
  {
    instructorName = instructor;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public void displayMessage( )
  {
    System.out.printf("Welcome To The Grade Book For %s \n", getCourseName() );
    System.out.printf("This course is presented by %s\n", getInstructorName());
  }

  public void inputGrades()
  {
    Scanner input = new Scanner(System.in);

    int grade;

    System.out.printf("%s\n%s\n ", "Enter Integer Grades within [0,100]", "Type Ctrl-D To indicator to terminate input " );

    while ( input.nextInt() != -1 )
    {
      grade = input.nextInt();
      total += grade;
      ++gradeCounter;

      incrementLetterGradeCounter( grade );
    }

  }

  public void incrementLetterGradeCounter( int grade )
  {
    switch ( grade / 10 )
    {
      case 9:
      case 10:
        aCount++;
        break;

      case 8:
        bCount++;
        break;

      case 7:
        cCount++;
        break;

      case 6:
        dCount++;
        break;

      default:
        fCount++;
        break;
    }
  }

  public void displayGradeReport()
  {
    System.out.println("\n Grade Report : ");

    if ( gradeCounter != 0 )
    {
      double average = (double) total/gradeCounter;

      System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total );
      System.out.printf("Class Average Is %.2f\n", average);
      System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
          "Number of students who received each grade : ",
          "A :  ", aCount,
          "B :  ", bCount,
          "C :  ", cCount,
          "D :  ", dCount,
          "F :  ", fCount);
    }
    else
        System.out.println("No grades were entered ! \n");
  }
}
