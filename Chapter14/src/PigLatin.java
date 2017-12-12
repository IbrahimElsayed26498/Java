/*
 * Exercise 14.7 : PigLatin.java
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class PigLatin {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter An English Sentence And Press Enter");
        String englishSentence = scanner.nextLine();

        String[] englishTokens = englishSentence.split(" ");

        System.out.printf("\nYour Pig Latin Sentence Is : ");

        for (String word : englishTokens)
        {
            StringBuilder wordBuilder = new StringBuilder(word);

            char firstChar = word.charAt(0);

            wordBuilder.deleteCharAt(0);

            wordBuilder.append(firstChar)
                       .append("ay")
                       .append(" ");

            System.out.printf("%s", wordBuilder );
        }
    }
}