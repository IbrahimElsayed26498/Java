/**
 * Exercise 14.14 : Converting int codes to character
 */

import java.util.Scanner;

public class IntegerCodes {

    public static void main(String[] args)
    {
        System.out.printf("Enter an integer code : ");

        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();

        System.out.printf("Enter a radix/base : ");
        int radix  = scanner.nextInt();

        // int[] integer = new int[256];

        System.out.printf("The character version of %d is %s", integer, Character.forDigit(integer, radix));
    }
}
