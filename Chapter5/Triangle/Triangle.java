// Triangle.java
// Exercise 5.15 And 5.22

public class Triangle
{
  public static void main(String[] args)
  {
    System.out.printf("Triangle (a)");

    for (int i = 0; i < 10; i++)
    {
      for ( int j = 0; j < i; j++)
      {
        System.out.printf("* ");
      }
      System.out.println("");
    }

    System.out.printf("\nTriangle (b)\n");

    for (int i = 0; i < 10; i++)
    {
      for ( int j = 10; j > i; j--)
      {
        System.out.printf("* ");
      }
      System.out.println("");
    }

    System.out.printf("\nTriangle (c)\n");

    for (int i = 0; i < 10; i++)
    {
      for ( int j = 0; j < i; j++)
      {
        System.out.printf("  ");
      }
      for ( int j = 10; j > i; j--)
      {
        System.out.printf("* ");
      }
      System.out.println("");
    }

    System.out.printf("\nTriangle (d)\n");

    for (int i = 0; i < 10; i++)
    {
      for ( int j = 10; j > i; j--)
      {
        System.out.printf("  ");
      }

      for ( int j = 0; j < i; j++)
      {
        System.out.printf("* ");
      }
      System.out.println("");
    }

    System.out.printf("(a)\t\t\t(b)\t\t\t\t(c)\t\t\t\t(d)\n");
    for (int i = 1; i <= 10; i++)
    {
      // Prints Triangle (a)
      for ( int j = 0; j < i; j++)
      {
        System.out.printf("* ");
      }
      if (i <= 3)
      {
        System.out.printf("\t\t\t");
      }
      if (( i >= 4) && (i <= 7))
      {
        System.out.printf("\t\t");
      }
      if (i > 7)
      {
        System.out.printf("\t");
      }

      // Prints Triangle (b)
      for ( int j = 10; j >= i; j--)
      {
        System.out.printf("* ");
      }
      if (i <= 3)
      {
        System.out.printf("\t\t");
      }
      if (( i >= 4) && (i <= 7))
      {
        System.out.printf("\t\t\t");
      }
      if (i > 7)
      {
        System.out.printf("\t\t\t\t");
      }

      // Prints triangle (c)
      for ( int j = 1; j < i; j++)
      {
        System.out.printf("  ");
      }
      for ( int j = 10; j >= i; j--)
      {
        System.out.printf("* ");
      }
      System.out.printf("\t\t");

      // Prints Triangle (d)
      for ( int j = 10; j > i; j--)
      {
        System.out.printf("  ");
      }
      for ( int j = 0; j < i; j++)
      {
        System.out.printf("* ");
      }
      System.out.printf("\t\t");

      System.out.printf("\n");

    }

  }
}
