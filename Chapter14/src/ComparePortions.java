/**
 * Exercise 14.4 : Comparing Portions Of Strings.
 */

import java.util.Scanner;

public class ComparePortions {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Program compares regions of two strings : \n");

        System.out.printf("Enter the first string : ");
        String first = scan.next();

        System.out.printf("Enter the second string : ");
        String second = scan.next();

        System.out.printf("How many characters would you like to compare ?");
        int number = scan.nextInt();

        System.out.printf("In which position should the comparism start ? ");
        int position = scan.nextInt();

        if ( first.equals(second) )
            System.out.printf("%s and %s are equals", first.toString(), second.toString() );
        else if (first.regionMatches(position, second, 0, number ))
            System.out.printf("%s and %s match at %s",
                    first.toString(), second.toString(), first.substring(position, position + number));
        else
            System.out.printf("%s and %s don't match", first.toString(), second.toString() );
    }
}
