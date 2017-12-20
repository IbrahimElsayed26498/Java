/*
 * Fig. 16.7: SortTwo.java
 * Using a Comparator object with method sort
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class SortTwo
{
    public static void main(String[] args)
    {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits); // Create list
        System.out.printf("Unsorted array elements: %s\n", list);

        // sort in descending order using a comparator
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted list elements: %s\n", list);
    }
}