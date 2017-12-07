/**
 * Fig. 14.7: StringConcatenation.java
 * String concat method
 */

public class StringConcatenation {

    public static void main(String[] args)
    {
        String s1 = "Happy ";
        String s2 = "Birthday";

        System.out.printf("\ns1 = %s\ns2 = %s\n",s1, s2);
        System.out.printf("\nResult of s1.concat(s2) = %s", s1.concat(s2));

        System.out.printf("\ns1 after concatenation = %s\n", s1);
    }
}
