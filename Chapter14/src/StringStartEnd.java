/**
 * Figure 14.4 : StringStartEnd.java
 */

public class StringStartEnd {

    public static void main(String[] args)
    {
        String[] strings = {"started,", "starting", "ended", "ending"};

        // test method startsWith

        for (String string : strings)
        {
            if (string.startsWith("st"))
                System.out.println("\"%s\" starts with \"st\"\n");
        }

        System.out.println();

        // test method startsWith from position 2
        for (String string : strings)
        {
            if (string.startsWith("art", 2))
                System.out.println("\"%s\" starts with \"st\" from position 2\n" );
        }

        System.out.println();

        //test method endsWith()
        for (String str : strings)
        {
            if (str.endsWith("ed"))
                System.out.printf("\"%s\" ends with \"ed\"%n", str);
        }
    }
}
