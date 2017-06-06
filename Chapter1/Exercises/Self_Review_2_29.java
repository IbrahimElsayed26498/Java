// Self_Review_2_29.java
// Self_Review_2_29 computes integer value of a character

import java.util.Scanner;

public class Self_Review_2_29
{
  public static void main(String[] args)
  {
    Scanner into = new Scanner (System.in);

    char buffer;

    System.out.println("Enter A Character : ");
    buffer = into.next().charAt(0);

    System.out.printf("The integer equivalent of %c is %d\n", buffer, ((int) buffer ) );
  }
}
