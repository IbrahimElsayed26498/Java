/*
 * Exercise 14.11 - 14.12 : Search Character(s) In Text
 */

import java.util.Scanner;

public class SearchString {

    public static void main(String[] args)
    {
        Scanner scanLine = new Scanner(System.in);
        Scanner scanChar = new Scanner(System.in);

        System.out.printf("Please enter a line of text : ");
        String text = scanLine.nextLine();

        char[] character = new char[text.length()];

        for (int j = 0; j < text.length(); j++)
        {
            character[j] = text.charAt(j);
        }

        int[] occurences = new int[text.length()];

        for (int k = 0; k < occurences.length; k++)
            occurences[k] = 0;

        for (int j = 0; j < text.length(); j++)
        {
            for (int i = 0; i < text.length(); i++)
            {
                if ( text.charAt(i) == character[j] )
                {
                    System.out.printf("%c is located at index %d\n", character[j], i);
                    occurences[j]++;
                }
            }
        }

        System.out.printf("Character \t Occurences");

        for (int j = 0; j < text.length(); j++)
        {
            if (occurences[j] < 2)
                System.out.printf("\n%c \t\t %d ", character[j], occurences[j]);
            else
                System.out.printf("\n%c \t\t %d ", character[j], occurences[j]);
        }
    }
}