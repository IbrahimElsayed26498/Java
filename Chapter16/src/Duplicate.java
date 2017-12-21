/**
 * Exercise 16.13 : Duplicate.java
 * Eliminate Duplicates from a set of strings
 */

import java.util.*;

public class Duplicate {

    public static void main(String[] args)
    {
        String[] firstNames = { "Acha", "Ayuk", "Agbor", "Awasum", "Esoh", "Acha", "Epolle", "Kamga", "Kamga", "Ayuk"};
        List<String> listOne = Arrays.asList(firstNames);

        System.out.printf("List : %s", listOne);

        System.out.printf("After Eliminating Duplicates\nList : %s", eliminateDuplicate(listOne));
    }

    // Eliminate duplicates from list
    private static Collection<String> eliminateDuplicate(Collection<String> list)
    {
        //Create a set
        Set<String> set = new HashSet<>(list);

        System.out.println();

        return set;
    }
}
