/**
 * Fig. 14.16: StaticCharMethods2.java
 * Character static conversion methods
 */

import java.util.Scanner;

public class StaticCharMethods2 {

    // executes application
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // get radix
        System.out.printf("Please Enter A radix : ");
        int radix = scanner.nextInt();

        // get user choice
        System.out.printf("Please choose one :\n1 -- %s\n2 -- %s\n", "Convert digit to character", "Convert character to digit");
        int choice = scanner.nextInt();

        // process request
        switch(choice)
        {
            case 1: // convert digit to character
                System.out.printf("Enter A Digit : ");
                int digit = scanner.nextInt();
                System.out.printf("Converted Digit %d To Character %s \n", digit, Character.forDigit(digit, radix));
                break;

            case 2:
                System.out.printf("Enter A Character : ");
                char character = scanner.next().charAt(0);
                System.out.printf("Converted Character %s To Digit %d \n", character, Character.digit(character, radix));
                break;
        }
    }
}
