/*
 * Figure 11.3 : DivideByZeroWithExceptionHandling.java
 * Handling Arithmetic Exceptions and InputMismatchExceptions
 */

 import java.util.InputMismatchException;
 import java.util.Scanner;

 public class DivideByZeroWithExceptionHandling
 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determines if more input is needed

        do{

            try { // try reading two numbers and calculate quotient

                System.out.print("\nPlease Enter An Integer Numerator : ");
                int numerator = scanner.nextInt();

                System.out.print("\nPlease Enter An Integer Denominator : ");
                int denomenator = scanner.nextInt();

                double result = quotient(numerator, denomenator);
                System.out.printf("\nResult : %.2f / %d = %d\n", result, numerator, denomenator);

                continueLoop = false;
            }
            catch( InputMismatchException inputMismatchException )
            {
                System.err.printf("\nException : %s\n", inputMismatchException );
                scanner.nextLine();

                System.out.printf("You must enter integers. Please try again");
            }
            catch(ArithmeticException arithmeticException)
            {
               System.err.printf("\nException : %s\n", arithmeticException );
               System.out.printf("Zero is an invalid denomenator. Try something else\n");
            }
        } while (continueLoop);
    }

    public static double quotient(int numerator, int denomenator) throws ArithmeticException
    {
        return numerator / denomenator; // possible divide by zero exception
    }
 }