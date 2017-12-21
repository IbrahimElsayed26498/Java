/**
 * Exercise 16.21
 * print PriorityQueue in descending order
 */

import java.util.*;

public class DescendingPQueue {

    public static void main(String[] args)
    {
        // queue of capacity 11
        PriorityQueue<Double> queue = new PriorityQueue<>();

        // insert elements to queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        queue.offer(1.2);
        queue.offer(0.4);
        queue.offer(12.3);

        // Convert queue into list
        List<Double> list = new ArrayList<Double>(queue);

        System.out.printf("\nList Sorted In Ascending Order : ");

        Collections.sort(list);

        for (Double d : list)
            System.out.printf("%.1f ", d);

        System.out.println();

        System.out.printf("\nList Sorted In Descending Order : ");

        Collections.sort(list, Comparator.reverseOrder());

        for (Double d : list)
            System.out.printf("%.1f ", d);
        System.out.println();
    }
}
