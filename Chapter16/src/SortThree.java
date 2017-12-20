/**
 * Fig. 16.9: SortThree.java
 * Collections method sort with a custom Comparator object
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortThree {

    public static void main(String[] args)
    {
        List<TimeTwo> list = new ArrayList<>(); // Create list

        list.add(new TimeTwo(6, 24, 34));
        list.add(new TimeTwo(18, 14, 58));
        list.add(new TimeTwo(6, 05, 34));
        list.add(new TimeTwo(12, 14, 58));
        list.add(new TimeTwo(6, 24, 22));

        // Output list objects
        System.out.printf("Unsorted array elements:\n%s\n", list);

        // sort in order using a comparator
        Collections.sort(list, new TimeComparator());

        // Output list objects
        System.out.printf("Unsorted array elements:\n%s\n", list);
    }
}
