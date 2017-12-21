/**
 * Exercise 16.14 : letterCount.java
 * Count the number of occurences of each letter in a sentence
 */

import java.util.*;

public class letterCount {

    public static void main(String[] args)
    {
        //Create a HashMap to store Character keys and Integer values
        Map<Character, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    }

    // create map from user input
    private static void createMap(Map<Character, Integer> map)
    {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a sentence:"); // prompt for user input
        String input = scanner.nextLine();

        // Convert the input String to
        Character[] sentence = input.chars().mapToObj(c -> (char)c).toArray(Character[]::new);

        for (Character character : sentence)
        {

            if (map.containsKey(character))
            {
                int count = map.get(character);
                map.put(character, count + 1);
            }
            else
                map.put(character, 1);
        }
    }

    // display map content
    private static void displayMap(Map<Character, Integer> map)
    {
        Set<Character> keys = map.keySet(); // get keys

        // Sort keys
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.printf("\nMap contains:\nKey\t\tValue\n");

        // generate output for each key in map
        for (Character key : sortedKeys)
            System.out.printf("%-10s%10s\n", key, map.get(key));

        System.out.printf("\nsize: %d\nisEmpty: %b\n", map.size(), map.isEmpty());
    }
}
