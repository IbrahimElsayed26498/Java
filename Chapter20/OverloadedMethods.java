// Printing array elements using overloaded methods

package deitel;

public class OverloadedMethods
{
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains : \n");
        printArray(integerArray);
        System.out.println("Array doubleArray contains : \n");
        printArray(doubleArray);
        System.out.println("Array CharacterArray contains : \n");
        printArray(characterArray);
    }

    // method printArray to print Integer Array
    public static void printArray(Integer[] inputArray)
    {
        // Display array elements
        for (Integer element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }

    // method printArray to print Double Array
    public static void printArray(Double[] inputArray)
    {
        // Display array elements
        for (Double element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }

    // method printArray to print Double Array
    public static void printArray(Character[] inputArray)
    {
        // Display array elements
        for (Character element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }
}
