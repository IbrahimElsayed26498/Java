/**
 * Fig. 16.6: SortOne.java
 * Collections method sort
 */

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortOne {

    public static void main(String[] args)
    {
        String[] suits = {"Hearts" ,"Diamonds", "Clubs", "Spades"};

        // Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s\n", list);

        Collections.sort(list); // Sort ArrayList
        System.out.printf("Sorted array elements: %s\n", list);
    }
}
