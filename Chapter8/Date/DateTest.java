// DateTest.java

public class DateTest
{
  public static void main(String[] args)
  {
    Date d = new Date(1, 23, 2017);

    System.out.printf("The Date Is %s\n", d.toString());
    System.out.printf("The Date Is %s\n", d.toUnitedStatesString());

    System.out.printf("We're Now Incrementing Day\n");
    for ( int j = 0; j < 4; j++)
    {
      d.nextDay();
      System.out.printf("The Date Is %s\n", d.toString());
      System.out.printf("The Date Is %s\n", d.toUnitedStatesString());
    }

    System.out.printf("\n\n");

    Date e = new Date("July", 22, 2017);
    System.out.printf("The Date Is %s\n", e.toString());
    System.out.printf("The Date Is %s\n", e.toUnitedStatesString());

    System.out.printf("We're Now Incrementing Month\n");
    for ( int j = 0; j < 4; j++)
    {
      e.nextMonth();
      System.out.printf("The Date Is %s\n", e.toString());
      System.out.printf("The Date Is %s\n", e.toUnitedStatesString());
    }

    System.out.printf("\n\n");

    Date f = new Date(210, 2005);
    System.out.printf("The Date Is %s\n", f.toString());
    System.out.printf("The Date Is %s\n", f.toUnitedStatesString());

    System.out.printf("We're Now Initialising Year\n");
    for ( int j = 0; j < 400; j+=100)
    {
      f.nextYear();
      System.out.printf("The Date Is %s\n", f.toString());
      System.out.printf("The Date Is %s\n", f.toUnitedStatesString());
    }
  }
}
