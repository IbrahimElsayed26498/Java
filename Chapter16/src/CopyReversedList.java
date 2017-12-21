/**
 * Exercise 16.18 : CopyReversedList.java
 * Copy the Reverse of a LinkedList into another LinkedList
 */

import java.util.*;

public class CopyReversedList {

    public static void main(String[] args)
    {
        // Create and display first LinkedList<Character>
        Character[] characters = {'A', 'B', 'o', 'y', 'T', 'h', 'i', 'n', 'k', 's'};
        LinkedList<Character> linkedListOne = new LinkedList<Character>(Arrays.asList(characters));

        System.out.println("\nFirst List linkedListOne contains: ");
        for( Character element : linkedListOne )
            System.out.printf("%s ", element );

        // Create and display second LinkedList<Character>
        Character[] charactersTwo = {'S', 'o', 'm', 'e', 'g', 'i', 'r', 'l', 's', 'T', 'h', 'i', 'n', 'k'};
        LinkedList<Character> linkedListTwo = new LinkedList<Character>(Arrays.asList(charactersTwo));

        Collections.reverse(linkedListOne);

        System.out.println("\nFirst List linkedListOne reversed: ");
        for( Character element : linkedListOne )
            System.out.printf("%s ", element );

        System.out.println("\nCopy linkedListOne into LinkedListTwo : ");
        Collections.copy(linkedListTwo, linkedListOne);

        System.out.println("\nFirst List linkedListTwo contains: ");
        for( Character element : linkedListTwo )
            System.out.printf("%s ", element );
    }
}
