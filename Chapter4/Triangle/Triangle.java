// Triangle.java

import java.util.Scanner;

public class Triangle
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    int base, height, hypotenuse;

    System.out.println("Enter First Integer :");
    base = input.nextInt();

    System.out.println("Enter First Integer :");
    height = input.nextInt();

    System.out.println("Enter First Integer :");
    hypotenuse = input.nextInt();

    if ((( base + height > hypotenuse ) && ( base + hypotenuse > height )) && ( hypotenuse + height > base))
    {
      System.out.printf("Your Integers %d, %d and %d Represent The Sides Of A Triangle\n", base, height, hypotenuse );

      if ( base * base + height * height == hypotenuse * hypotenuse)
          System.out.printf("Your Integers %d, %d and %d Represent The Sides Of A Right-Angled Triangle\n", base, height, hypotenuse);
    }




  }
}
