// GradeBook.java

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
    System.out.printf("Welcome To The Grade Book For %s With Instructor %s \n", getCourseName(), getInstructorName() );
  }
}
