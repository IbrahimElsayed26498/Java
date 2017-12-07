/**
 * Figure 14.5 : StringIndexMethods.java
 */
public class StringIndexMethods
{
    public static void main(String[] args)
    {
        String letter = "abcdefghijklmadksfd";

        // test indexOf to locate the starting position of a character in a string
        System.out.printf("'c' is located at index %d\n", letter.indexOf('c'));
        System.out.printf("'a' is located at index %d\n", letter.indexOf('a', 1));
        System.out.printf("'$' is located at index %d\n", letter.indexOf('$'));

        // test lastIndexOf to locate the ending position of a substring in a string
        System.out.printf("'c' is located at index %d\n", letter.lastIndexOf('c'));
        System.out.printf("'a' is located at index %d\n", letter.lastIndexOf('a', 25));
        System.out.printf("'$' is located at index %d\n", letter.lastIndexOf('$'));

        // test indexOf to locate a substring in a string
        System.out.printf("\"def\" is located at index %d\n", letter.indexOf("def"));
        System.out.printf("\"def\" is located at index %d\n", letter.indexOf("def", 7));
        System.out.printf("\"hello\" is located at index %d\n", letter.indexOf("hello"));

        // test lastIndexOf to find a substring in a string
        System.out.printf("Last \"def\" is located at index %d\n", letter.lastIndexOf("def"));
        System.out.printf("Last \"def\" is located at index %d\n", letter.lastIndexOf("def", 25));
        System.out.printf("Last \"hello\" is located at index %d\n", letter.lastIndexOf("hello"));
    }
}
