// Book.java

public enum Book
{
  // declare constants of enum type
  JHTP( "Java How To Program", "2012" ),
  CHTP( "C How To Program", "2007" ),
  IW3HTP( "Internet And World Wide Web How To Program", "2008" ),
  CPPHTP( "C++ How To Program", "2012" ),
  VBHTP( "Visual Basic 2010 How To Program", "2011" ),
  CSHARPHTP( "Visual C# 2010 How To Program", "2011" );

  // instance fields
  private final String title; // book title
  private final String copyrightYear; // copyright year

  // enum constructor
  Book( String bookTitle, String year )
  {
    title = bookTitle;
    copyrightYear = year;
  } // end enum Book constructor

  // accessor for field title
  public String getTitle()
  {
    return title;
  } // end method getTitle

  // accessor for field copyrightYear
  public String getCopyrightYear()
  {
    return copyrightYear;
  } // end method getCopyrightTitle
}
