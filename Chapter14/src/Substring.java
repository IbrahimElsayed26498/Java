/**
 * Figure 14.6 : Substring.java
 */
public class Substring
{
    public static void main(String[] args)
    {
        String letters = "abcdefghijklmabcdefghijklm";

        // test substring methods
        System.out.printf("Substring from index 20 to end is \"%s\"%n", letters.substring(20));
        System.out.printf("Substring from index 3 up to, but not including is \"%s\"\n", letters.substring(3,6));
    }
}
