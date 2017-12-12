/**
 * Exercise 14.13 - 14 : Tokenizing and comparing Strings
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizeStrings {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Please Enter A Sentence With Words starting with b : ");
        String sentence = scanner.nextLine();

        String[] sentenceTokens = sentence.split(" ");

        System.out.printf("Words Starting With b\n");

        for (String token : sentenceTokens)
        {
            if (token.startsWith("b"))
                System.out.printf("%s ",token);
        }

        System.out.printf("Words Ending With ED\n");

        for (String token : sentenceTokens)
        {
            if (token.endsWith("ED"))
                System.out.printf("%s ",token);
        }
    }
}