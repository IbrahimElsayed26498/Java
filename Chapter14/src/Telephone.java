/**
 * Exercise 14.8 : Telephone.java
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Telephone {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter A Telephone Number In The Form : (555) 555-5555\n");
        String telephone = scanner.nextLine();

        telephone.replaceAll("\\(", "");
        telephone.replaceAll("\\)", "");
        telephone.replaceAll("\\-", " ");

        System.out.println(telephone);

        String[] tokens = telephone.split(" ") ;

        for (String t : tokens)
            System.out.printf("%s\n", t);
    }
}
