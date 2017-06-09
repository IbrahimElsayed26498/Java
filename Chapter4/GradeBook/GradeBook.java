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
    int average;

    total = 0;
    gradeCounter = 1;

    while ( gradeCounter <= 10 )
    {
      System.out.print("Enter Grade : ");
      grade = input.nextInt();
      total += grade;
      gradeCounter++;
    }

    average = total / 10;

    System.out.printf("\nTotal Of All 10 Grades Is %d\n", total);
    System.out.printf("Class Average is %d\n", average);

  }
}
