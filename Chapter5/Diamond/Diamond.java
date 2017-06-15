// Diamond.java

import java.util.Scanner;

public class Diamond
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    // Print an Asterisk
    int aslength, boxlength, wslength, starlength; // Relevant variables
    int println, j;

    System.out.println("Let's Print An Asterisk !");

    System.out.println("Enter an integer value greater than 1 and less than 19 : ");
    aslength = input.nextInt();
    System.out.printf("An Diamond With Distance From Center To Radius Of %d Will Be Printed Below\n", aslength);

    boxlength = 2 * aslength - 1;
    wslength = aslength - 1;
    starlength = 1;
    println = 0; // We've printed no line yet

    for (println = 0; println <= Math.ceil(boxlength / 2); println++)
    {
   	  starlength = 2 * ( println ) + 1;
   	  for (j = 0;j < wslength;j++){
   	      System.out.printf("  ");
   	    }
   	    for (int k = 0;k < starlength;k++){
   	      System.out.printf("* ");
   	    }
   	    for (int l = 0;l < wslength;l++){
   	     System.out.printf("  ");
   	   }
   	   System.out.println("");
   	   if (wslength > 0)
   	      wslength--;
    }

    wslength++;

    for (println = (int ) Math.ceil(boxlength / 2); println > 0; println--)
     {
   	   starlength = 2 * ( println ) - 1;
   	   for (j = 0;j < wslength;j++){
   	     System.out.printf("  ");
   	   }
   	   for (int k = 0;k < starlength;k++){
   	     System.out.printf("* ");
   	   }
   	   for (int l = 0;l < wslength;l++){
   	     System.out.printf("  ");
   	   }
   	   System.out.println("");
   	   if (wslength >= 0)
   	      wslength++;
     }
  }
}
