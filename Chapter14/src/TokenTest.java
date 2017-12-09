/**
 * Fig. 14.18: TokenTest.java
 * StringTokenizer object used to tokenize strings
 */

import java.util.Scanner;

public class TokenTest {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter A Sentence And Press Enter : ");
        String sentence = scanner.nextLine();

        // Process user sentence
        String[] tokens = sentence.split(" ");
        System.out.printf("Nuqmber of elements: %d\nThe tokens are: \n", tokens.length );

        // Print out tokens
        for (String token : tokens)
            System.out.println(token);
    }
}