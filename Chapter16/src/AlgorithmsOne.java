/**
 * Fig. 16.11: Algorithms1.java
 * Collections methods reverse, fill, copy, max and min
 */

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class AlgorithmsOne {

    public static void main(String[] args)
    {
        // Create and display a List<Character>
        Character[] letters = {'P','M','C'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);

        // reverse and display the List<Character>
        Collections.reverse(list);
        System.out.printf("\nAfter calling reverse, list contains:\n");
        output(list);

        // create copyList from an array of 3 Characters
        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        // copy the contents of list into copyList
        Collections.copy(copyList, list);
        System.out.printf("\nAfter copying, copyList contains:\n");
        output(list);

        // fill list with Rs
        Collections.fill(list, 'R');
        System.out.printf("\nAfter calling fill, list contains:\n");
        output(list);
    }

    // Output List information
    private static void output(List<Character> listRef)
    {
        System.out.print("The list is: ");

        for (Character element : listRef)
            System.out.printf("%s ", element);

        System.out.printf("\nMax: %s", Collections.max(listRef));
        System.out.printf("\nMin: %s", Collections.min(listRef));
    }
}
