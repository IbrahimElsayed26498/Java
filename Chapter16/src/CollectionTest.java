/**
 * Figure 16.2 : CollectionTest.java
 * Collection interface demonstrated via an ArrayList object
 */

import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

    public static void main(String[] args)
    {
        // Add elements in colors array to list
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> list = new ArrayList<String>();

        for (String col : colors)
            list.add(col);

        // Add elements in removeColors to removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        for (String c : removeColors)
            removeList.add(c);

        // Output content of list
        System.out.printf("ArrayList Before Removing Colors\n");

        for (int count = 0; count < list.size(); count++)
            System.out.printf("%s  ", list.get(count) );

        // Remove the colors in removeList from list
        removeColors(list, removeList);

        // Output content of list
        System.out.printf("\nArrayList After Removing Colors\n");

        for (String color : list)
            System.out.printf("%s  ", color);
    }

    public static void removeColors(Collection<String> collectionOne, Collection<String> collectionTwo)
    {
        // Get Iterator
        Iterator<String> iterator = collectionOne.iterator();

        while(iterator.hasNext())
        {
            if (collectionTwo.contains(iterator.next()))
                iterator.remove();
        }
    }
}
