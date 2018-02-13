package deitel;

public class GenericMethodTest
{
    public static void main(String[] args) {

        //create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray prints out %d elements: \n",
                printArray(intArray, 0, 4));
        System.out.printf("Array doubleArray prints out %d elements: \n",
                printArray(doubleArray, 0, 2));
        System.out.printf("Array charArray prints out %d elements: \n",
                printArray(charArray, 0, 5));
    }

    // Generic method printArray
    public static <T> Integer printArray(T[] inputArray, Integer lowSubscript, Integer highSubscript)
    {
        try
        {
            if ((lowSubscript >= 0) && (highSubscript <= inputArray.length))
            {
                for ( int i = lowSubscript; i < highSubscript; i++)
                {
                    System.out.printf("%s ,", inputArray[i]);
                }
            }
        }
        catch(IndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }

        System.out.println();

        return highSubscript - lowSubscript + 1;
    }
}