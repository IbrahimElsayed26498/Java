/**
 * Fig. 16.14: StackTest.java
 * Stack class of package java.util.
 */

import java.util.Stack;
import java.util.EmptyStackException;

public class StackTest {

   public static void main(String[] args) {
       Stack<Number> stack = new Stack<>();

       // Use push value
       // Push Long value 12L
       stack.push(12L);
       System.out.println("Pushed 12L");
       printStack(stack);

       // push int value 34567
       stack.push(34567);
       System.out.println("Pushed 34567");
       printStack(stack);

       // push float value 1.0F
       stack.push(1.0F);
       System.out.println("Pushed 1.0F");
       printStack(stack);

       // push double value 1234.5678
       stack.push(1234.5678);
       System.out.println("Pushed 1234.5678");
       printStack(stack);

       //removes items from Stack
       try
       {
           Number removedObject = null;

           // pop elements from stack
           while(true)
           {
               removedObject = stack.pop();
               System.out.printf("Popped %s\n", removedObject);
               printStack(stack);
           }
       }
       catch(EmptyStackException emptyStack)
       {
           emptyStack.printStackTrace();
       }
   }

    // display Stack contents
    private static void printStack(Stack<Number> stack)
    {
        if (stack.isEmpty())
            System.out.printf("stack is empty\n\n"); // the stack is empty
        else
            System.out.printf("stack contains: %s (top) \n", stack);
    }
}
