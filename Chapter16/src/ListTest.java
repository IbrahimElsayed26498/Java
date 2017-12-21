/**
 * Figure 16.3 : ListTest.java
 * Lists, LinkedLists and ListIterators.
 */

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListTest {

    public static void main(String[] args)
    {
        // add colors elements to listOne
        String[] colorsOne = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> listOne = new LinkedList<String>();

        for (String color : colorsOne)
            listOne.add(color);

        // add colorsTwo elements to listTwo
        String[] colorsTwo = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> listTwo = Arrays.asList(colorsTwo);

        // concatenate both lists
        listOne.addAll(listTwo);

        //Release resources used by listTwo
        listTwo = null;

        printList(listOne);

        //Convert to uppercase Strings
        convertToUpperCaseStrings(listOne);
        printList(listOne);

        System.out.printf("\nDeleting Elements 4 to 6\n");
        removeItems(listOne, 4, 6);
        printList(listOne);
        printReversedList(listOne);
    }

    // Output List contents
    public static void printList(List<String> list)
    {
        System.out.printf("\nList : ");

        for( String color : list)
            System.out.printf("%s ", color);

        System.out.println();
    }

    // locate String objects and convert to uppercase
    public static void convertToUpperCaseStrings(List<String> list)
    {
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext())
        {
            iterator.set(iterator.next().toUpperCase());
        }
    }

    // obtain sublist and use clear method to delete sublist items
    public static void removeItems(List<String> list, int start, int end)
    {
        list.subList(start, end).clear();
    }

    // print reversed list
    public static void printReversedList(List<String> list)
    {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("\nReversed ListOne : ");

        // print list in reverse order
        while(iterator.hasPrevious())
            System.out.printf("%s ", iterator.previous());
    }
}
