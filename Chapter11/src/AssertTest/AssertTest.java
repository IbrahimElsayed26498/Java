/*
 * Figure 11.8 AssertJava.java
 * Checking with assert that a value is within range
 * Run with -ea exception
 */

 import java.util.Scanner;

 public class AssertTest
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);

         System.out.printf("Enter A Number Between 0 and 10  :  ");
         int number = input.nextInt();

         // assert that a value is within closed interval [0,10]

         assert ((number >= 0) && (number <= 10)) : "Bad Number : " + number;

         System.out.printf("You Entered %d\n", number);
     }
 }