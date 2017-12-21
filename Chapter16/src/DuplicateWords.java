/**
 * Exercise 16.16 (Counting Duplicate Words)
 * program counts the number of duplicate words in a sentence
 */

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateWords {

    public static void main(String[] args)
    {
        // create HashMap to store String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    }

    // create map from user input
    private static void createMap(Map<String, Integer> map)
    {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String sentence = scanner.nextLine();

        // tokenize the input
        String[] words = sentence.split(" ");

        // processing input text
        for (String token : words)
        {
            String word = token.toLowerCase(); // get lower case word

            // if the map contains the word
            if (map.containsKey(word)) // is word in map
            {
                int count = map.get(word); // get current count
                map.put(word, count + 1); // increment count
            }
            else
                map.put(word, 1); // add new word with a count of 1 to map
        }
    }

    // display map content
    private static void displayMap(Map<String, Integer> map)
    {
        Set<String> keys = map.keySet(); // get keys

        // Sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("\nMap contains:\nDuplicates\t\tOccurences\n");

        // generate output for each word which is a duplicate in map
        for (String key : sortedKeys)
        {
            if (map.get(key) > 1)
                System.out.printf("%-10s%10s\n", key, map.get(key));
        }
    }
}
