/**
 * Fig. Fig. 16.13: Algorithms2.java
 * Collections methods addAll, frequency and disjoint
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlgorithmsTwo {

    public static void main(String[] args)
    {
        // Initialize listOne and listTwo
        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> listOne = Arrays.asList(colors);
        List<String> listTwo = new ArrayList<>();

        listTwo.add("black");
        listTwo.add("red");
        listTwo.add("green");

        System.out.print("Before addAll, listTwo contains: ");

        // Display elements in listTwo
        for (String s : listTwo)
            System.out.printf("%s ", s);

        Collections.addAll(listTwo, colors);

        System.out.printf("\nAfter addAll, listTwo contains: ");

        // Display elements in listTwo
        for (String s : listTwo)
            System.out.printf("%s ", s);

        // Get frequency of "red"
        int frequency = Collections.frequency(listTwo, "red");
        System.out.printf("\nFrequency of red in listTwo: %d\n", frequency);

        // check whether list1 and list2 have elements in common
        boolean common = Collections.disjoint(listOne, listTwo);
        System.out.printf("listOne and listTwo %s elements in common\n", (common ? "don't have" : "have"));
    }
}
