/**
 * Exercise 14.11 : Search Character In Text
 */

import java.util.Scanner;

public class SearchString {

    public static void main(String[] args)
    {
        Scanner scanLine = new Scanner(System.in);
        Scanner scanChar = new Scanner(System.in);

        System.out.printf("Please enter a line of text : ");
        String text = scanLine.nextLine();

        System.out.printf("Please enter a character : ");
        char character = scanChar.next().charAt(0);

        int times = 0;

        for (int i = 0; i < text.length(); i++)
        {
            if ( text.charAt(i) == character )
            {
                System.out.printf("%c is located at index %d\n", character, i);
                times++;
            }
        }

        System.out.printf("\n%c occurs %d times in text %s\n", character, times, text);
    }
}
