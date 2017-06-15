// Triangle.java

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

  }
}
