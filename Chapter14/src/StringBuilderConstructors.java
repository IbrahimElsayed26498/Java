/**
 * Figure 14.10 : StringBuilderConstructors.java
 * StringBuilder Constructors
 *
 */

public class StringBuilderConstructors {

    public static void main(String[] args)
    {
       StringBuilder bufferOne = new StringBuilder();
       StringBuilder bufferTwo = new StringBuilder(10);
       StringBuilder bufferThree = new StringBuilder("Hello");

        System.out.printf("BufferOne = \"%s\"\n", bufferOne);
        System.out.printf("BufferTwo = \"%s\"\n", bufferTwo);
        System.out.printf("BufferThree = \"%s\"\n", bufferThree);
    }
}
