/**
 * Exercise 14.5 : RandomSentences.java
 */

import java.security.SecureRandom;

public class RandomSentences {

    public static void main(String[] args)
    {
        SecureRandom randomNumbers = new SecureRandom();

        // Define the String[] arrays
        String[] article = {"a", "the", "some", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        // Define their random numbers
        int randomNVP = randomNumbers.nextInt(5);
        int randomA = randomNumbers.nextInt(6);

        StringBuilder sentence = new StringBuilder();

        // Create a sentence
        sentence.append(article[randomA])
                .append(" ")
                .append(noun[randomNVP])
                .append(" ")
                .append(verb[randomNVP])
                .append(" ")
                .append(preposition[randomNVP])
                .append(" ")
                .append(article[randomA])
                .append(" ")
                .append(noun[randomNVP])
                .append(".");

        System.out.printf("%s\n", sentence);
    }
}