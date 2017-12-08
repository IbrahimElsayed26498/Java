/**
 * Fig. 14.12: StringBuilderChars.java
 * StringBuilder methods charAt, setCharAt, getChars and reverse
 */

public class StringBuilderChars
{
    public static void main(String[] args)
    {
        StringBuilder buffer = new StringBuilder("Hello There");

        System.out.printf("Buffer : %s\n", buffer.toString());
        System.out.printf("Character at 0 is %s\nCharacter at 4 is %s\n", buffer.charAt(0), buffer.charAt(4));

        char[] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0 );
        System.out.printf("The characters are ");

        for( char character : charArray)
            System.out.print(character);

        buffer.setCharAt(0, 'h');
        buffer.setCharAt(6, 't');

        System.out.printf("\nBuffer : %s\n", buffer.toString() );

        buffer.reverse();
        System.out.printf("\nBuffer : %s\n", buffer.toString());
    }
}
