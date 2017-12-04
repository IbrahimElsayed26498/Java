/**
 * Figure 11.2 : DivideByZeroNoExceptionHandling.java
 * Integer division without exception handling
 */

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter An Integer Numerator : ");
        int numerator = scanner.nextInt();

        System.out.print("Please Enter An Integer Denominator : ");
        int denomenator = scanner.nextInt();

        double result = quotient(numerator, denomenator);
        System.out.printf("Result : %.2f / %d = %d\n", result, numerator, denomenator);
    }

    public static double quotient(int numerator, int denomenator)
    {
        return numerator/denomenator;
    }
}
