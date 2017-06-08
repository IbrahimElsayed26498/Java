// GradeBook.java

public class GradeBook
{
  private String courseName;

  public GradeBook( String name )
  {
    setCourseName( name );
  }

  public void setCourseName( String name )
  {
    courseName = name;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public void displayMessage( )
  {
    System.out.printf("Welcome To The Grade Book For %s\n", getCourseName() );
  }
}
