/**
 * Figure 14.2 : StringMiscellaneous.java.
 */
public class StringMiscellaneous {

    public static void main(String[] args)
    {
        String s1 = "Hello There";
        char[] charArray = new char[5];

        System.out.printf("Length of s1 = %d", s1.length());

        System.out.printf("\nThe String Reversed Is : \n");

        for (int count = s1.length() - 1; count >= 0; count--)
            System.out.println(s1.charAt(count));

        s1.getChars(0, 5, charArray, 0 );
        System.out.printf("\n The Character array is ");

        for (char character : charArray)
            System.out.print(character);

        System.out.println();
    }
}
