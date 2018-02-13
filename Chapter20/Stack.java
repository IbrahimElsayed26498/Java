package deitel;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {

    private final ArrayList<T> elements; // ArrayList stores stack elements

    // no-argument constructor creates a stack of the default size
    public Stack()
    {
        this(10);
    }

    // constructor creates a stack of the specified number of elements
    public Stack(int capacity)
    {
        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<T>(initCapacity);
    }

    // push element onto stack
    public void push(T pushValue)
    {
        elements.add(pushValue);
    }

    public T pop()
    {
        if (elements.isEmpty())
            throw new EmptyStackException();

        return elements.remove(elements.size() - 1);
    }
}
