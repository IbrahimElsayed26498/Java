// DateTest.java

public class DateTest
{
  public static void main(String[] args)
  {
    Date d = new Date(12, 23, 2017);

    System.out.printf("The Date Is %s\n", d.toString());

    System.out.printf("We're Now Incrementing Day\n");
    for ( int j = 0; j < 4; j++)
    {
      d.nextDay();
      System.out.printf("The Date Is %s\n", d.toString());
    }

    Date e = new Date(1, 23, 2007);

    System.out.printf("We're Now Incrementing Month\n");
    for ( int j = 0; j < 10; j++)
    {
      e.nextMonth();
      System.out.printf("The Date Is %s\n", e.toString());
    }

    Date f = new Date(11, 2, 2005);

    System.out.printf("We're Now Incrementing Year\n");
    for ( int j = 0; j < 400; j+=100)
    {
      f.nextYear();
      System.out.printf("The Date Is %s\n", f.toString());
    }
  }
}
