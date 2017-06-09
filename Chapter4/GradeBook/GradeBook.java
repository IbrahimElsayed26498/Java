// GradeBook.java

import java.util.Scanner;

public class GradeBook
{
  private String courseName;
  private String instructorName;

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

  public void determineClassAverage()
  {
    Scanner input = new Scanner ( System.in );

    int total;
    int gradeCounter;
    int grade;
    double average;

    total = 0;
    gradeCounter = 0;

    System.out.print("Enter Grade or -1 to quit : ");
    grade = input.nextInt();

    while ( grade != -1 )
    {
      System.out.print("Enter Grade or -1 To Quit : ");
      grade = input.nextInt();
      total += grade;
      gradeCounter++;
    }

    if ( gradeCounter != 0 )
    {
      average = ( double ) total / gradeCounter;

      System.out.printf("\nTotal Of All %d Grades Is %d\n", gradeCounter, total);
      System.out.printf("Class Average is %.2f\n", average);

    }
    else
      System.out.println("No Grades Were Entered");
  }
}
