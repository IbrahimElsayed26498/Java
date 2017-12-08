/**
 * Fig. 14.11: StringBuilderCapLen.java
 * StringBuilder length, setLength, capacity and ensureCapacity methods
 */
public class StringBuilderCapLen {

    public static void main(String[] args)
    {
        StringBuilder buffer = new StringBuilder("Hello, How Are You ?");

        System.out.printf("Buffer = %s\nlength = %d\nCapacity : %d\n\n", buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.printf("New Capacity : %d", buffer.capacity() );

        buffer.setLength(10);
        System.out.printf("New length : %d\nBuffer = %s\n", buffer.length(), buffer.toString());
    }


}
