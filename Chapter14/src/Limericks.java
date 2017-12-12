/*
 * Exercise 14.6 : Limericks
 */

import java.security.SecureRandom;

public class Limericks {

    public static void main(String[] args)
    {
        SecureRandom randomNumbers = new SecureRandom();

        // Define the String[] arrays
        String[] article = {"a", "the", "some", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};
        String[] oneTwoFive = {"day", "say", "ray", "gray", "may" };
        String[] threeFour = {"mightily", "rightly", "fightly", "sightly", "aightly", "heightly" };

        // Define their random numbers
        int randomNVP = randomNumbers.nextInt(5);
        int randomA = randomNumbers.nextInt(6);
        int randomOTF = randomNumbers.nextInt(5);
        int randomTF = randomNumbers.nextInt(6);


        StringBuilder[] limericks = new StringBuilder[5]; // A limerick is a grouping of five sentences


        // Initialise the StringBuilder array first
        for (int k = 0; k < limericks.length; k++)
        {
            limericks[k] = new StringBuilder("");
        }

        // create each sentence in limerick
        for (int i = 0; i < limericks.length; i++)
        {
            if ((i < 2) || (i == 4))
            {
                limericks[i].append(article[randomA])
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
                        .append(" ")
                        .append(oneTwoFive[randomOTF])
                        .append(".");
            }
            else
            {
                limericks[i].append(article[randomA])
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
                        .append(" ")
                        .append(threeFour[randomTF])
                        .append(".");
            }
        }

        // Print out each sentence
        for ( int j = 0; j < 5; j++)
        {
            System.out.printf("%s\n", limericks[j] );
        }
    }
}