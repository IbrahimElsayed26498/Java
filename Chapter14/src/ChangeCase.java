/**
 * Exercise 14.10 : Print lowercase and uppercase versions of sentences
 */

import java.util.Scanner;

public class ChangeCase {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter A Sentence : ");

        String sentenceOne = scanner.nextLine();

        String lowerSentence = new String(sentenceOne);

        System.out.printf("\"%s\" in lower case is ", sentenceOne.toString());

        for ( int i = 0; i < lowerSentence.length(); i++ )
            System.out.printf("%s", Character.toLowerCase(lowerSentence.charAt(i)));
        System.out.printf("\n");

        System.out.printf("Enter Another Sentence : ");
        String sentenceTwo = scanner.nextLine();
        String upperSentence = new String(sentenceTwo);

        System.out.printf("\"%s\" in upper case is ", sentenceTwo.toString());

        for ( int i = 0; i < upperSentence.length(); i++ )
            System.out.printf("%s", Character.toUpperCase(upperSentence.charAt(i)));
        System.out.printf("\n");
    }
}