/**
 * Exercise 16.17 InsertingElements.java
 * Inserting 25 Elements in a LinkedList in Sorted Order)
 */

import java.util.PriorityQueue;
import java.security.SecureRandom;
import java.util.Arrays;

public class InsertingElements {

    public static void main(String[] args)
    {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        SecureRandom randomNumber = new SecureRandom();
        int[] randomArray = new int[25];

        int sum = 0, s;
        double d;

        for (int i = 0; i < randomArray.length; i++)
        {
            randomArray[i] = randomNumber.nextInt(101);
            System.out.printf("%d ", randomArray[i]);
        }
        System.out.println();

        for (int j = 0; j < randomArray.length; j++)
            pQueue.offer(randomArray[j]);

        s = pQueue.size();
        System.out.printf("\nThe size of pQueue is %d \n", s);

        while(pQueue.size() > 0)
        {
            sum += pQueue.peek();
            pQueue.poll();
        }

        d = sum/s;

        System.out.printf("\nThe sum of the integers is %d\n", sum);
        System.out.printf("\nThe average of the integers is %.2f\n", d);
    }
}
