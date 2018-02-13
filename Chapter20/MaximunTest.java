/* Generic method maximum returns the largest of three objects */
package deitel;

public class MaximunTest
{
    public static void main(String[] args)
    {
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3,4,5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.5, maximum(6.6,8.8,7.5));
        System.out.printf("Maximum of %s, %s and %s is %s\n\n", "pear", "apple", "orange",
                maximum("pear","apple","orange"));
    }

    // Determines the largest of three Comparable objects
    public static Comparable maximum(Comparable x, Comparable y, Comparable z)
    {
        Comparable max = x; // Assume that x is the largest

        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}