/**
 * Exercise 14.3 : ComparingStrings.java
 */

import java.util.Scanner;

public class ComparingStrings {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter first string : ");
        String one = scanner.next();

        System.out.printf("Enter second string : ");
        String two = scanner.next();

        if ( one.compareTo(two) <= 0 )
            System.out.printf("%s is less than %s\n", one.toString(), two.toString());
        else
            System.out.printf("%s is more than %s\n", one.toString(), two.toString() );
    }
}
