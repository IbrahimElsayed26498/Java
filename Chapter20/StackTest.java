package deitel;

public class StackTest
{
    public static void main(String[] args) {
        double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        int[] integerElements = {1,2,3,4,5,6,7,8,9,10};

        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();

        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack);

        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack);
    }

    // test push method with double stack
    private static void testPushDouble(Stack<Double> stack, double[] values)
    {
        System.out.printf("\nPushing elements onto doubleStack\n");

        for (double value : values)
        {
            System.out.printf("%.1f ", value);
            stack.push(value);
        }
    }

    //test pop method on double stack
    private static void testPopDouble(Stack<Double> stack)
    {
        try
        {
            System.out.printf("Popping elements from doubleStack\n");
            double popValue;

            while(true)
            {
                popValue = stack.pop();
                System.out.printf("%.1f ", popValue);
            }
        }
        catch(EmptyStackException emptyStackException)
        {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    // test push method with integer stack
    private static void testPushInteger(Stack<Integer> stack, int[] values)
    {
        System.out.printf("\nPushing elements onto integerStack\n");

        for (int value : values)
        {
            System.out.printf("%d ", value);
            stack.push(value);
        }
    }

    // test pop method wit integer stack
    private static void testPopInteger(Stack<Integer> stack)
    {
        // pop elements from stack
        try
        {
            System.out.printf("\nPopping elements from integerStack\n");
            int popValue;

            while(true)
            {
                popValue = stack.pop();
                System.out.printf("%d", popValue);
            }
        }
        catch(EmptyStackException emptyStackException)
        {
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }
}
