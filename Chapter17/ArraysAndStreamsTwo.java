// Fig. 17.7: ArraysAndStreamsTwo.java
// Demonstrating lambdas and streams with an array of Strings.

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArraysAndStreamsTwo
{
  public static void main(String[] args)
  {
    String[] strings = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

    // display original strings
    System.out.printf("Original strings: %s\n", Arrays.asList(strings));

    // strings in uppercase
    System.out.printf("Strings in uppercase: %s\n", Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList()));

    // strings less than "n" (case insensitive) sorted ascending
    System.out.printf("Strings greater tham m sorted ascending : %s\n", Arrays.stream(strings)
                                                                              .filter(s -> s.compareToIgnoreCase("n") < 0)
                                                                              .sorted(String.CASE_INSENSITIVE_ORDER)
                                                                              .collect(Collectors.toList()));

    // strings less than "n" (case insensitive) sorted descending
    System.out.printf("Strings greater than m sorted descending: %s\n", Arrays.stream(strings)
                                                                              .filter(s -> s.compareToIgnoreCase("n") < 0)
                                                                              .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                                                                              .collect(Collectors.toList()));
  }
}
