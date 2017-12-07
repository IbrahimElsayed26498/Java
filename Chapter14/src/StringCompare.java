/**
 * Figure 14.3 : StringCompare.java
 */
public class StringCompare {

    public static void main(String[] args)
    {
        String s1 = new String("Hello");
        String s2 = "Goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";

        System.out.printf("\ns1 = %s\ns2 = %s\ns3 = %s\ns4 = %s", s1, s2, s3, s4 );

        System.out.println("Testing Equality Using equals()");

        if (s1.equals("Hello"))
            System.out.println("\ns1 Equals \"Hello\"");
        else
            System.out.println("\ns1 Is Not Equals \"Hello\"");

        System.out.println("\nTesting Equality Using ==");

        if(s1 == "Hello")
            System.out.println("\ns1 is the same object as \"Hello\"");
        else
            System.out.println("\ns1 is not the same object as \"Hello\"");

        System.out.println("Testing compareTo()");
        System.out.printf("s1.compareTo(s2) Is %d\n", s1.compareTo(s2));
        System.out.printf("s2.compareTo(s1) Is %d\n", s2.compareTo(s1));
        System.out.printf("s1.compareTo(s1) Is %d\n", s1.compareTo(s1));
        System.out.printf("s3.compareTo(s4) Is %d\n", s3.compareTo(s4));
        System.out.printf("s4.compareTo(s3) Is %d\n", s4.compareTo(s3));

        System.out.println("Testing regionMatches (case sensitive)");

        if (s3.regionMatches(0, s4, 0, 5))
            System.out.println("First 5 characters of s3 and s4 match\n");
        else
            System.out.println("First 5 characters of s3 and s4 do not match\n");

        System.out.println("Testing regionMatches (ignore case )");

        if (s3.regionMatches(true, 0, s4, 0, 5 ))
            System.out.println("First 5 characters of s3 and s4 match with case ignored\n");
        else
            System.out.println("First 5 characters of s3 and s4 do not match with case ignored\n");
    }
}