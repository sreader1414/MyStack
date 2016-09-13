// Stephen Reader
// 10552526

// Import
import java.util.*;

// create Mystack class with <type> to handle integers, strings, ect....
public class MyStack<type>
{
    // Create a new array list
    public ArrayList<type> list;

    // This function is used to add what is in the collection to the Stack
    public MyStack(Collection<?> c)
    {
        // Initialize the list
        list = new ArrayList<type>();

        // Iterate through collection
        Iterator itr = c.iterator();
        while(itr.hasNext())
        {
            // Add collection data to the list
            type i = (type) itr.next();
            list.add(i);
        }
    }

    // Checks if the stack is empty
    public boolean empty()
    {
        return (list.size() == 0);
    }

    // Couldn't get this to work... Gave up on it!
    public Collection<type> changeImpl(Collection<type> c)
    {
        //System.out.println(list.getClass());
        while(!empty())
        {
            c.add((list.get(size()-1)));
            list.remove(size()-1);
        }
        LinkedList<type> tempElements = new LinkedList<type>(c);
        Collections.reverse(tempElements);

        c = tempElements;
        return c;
    }


    // Stack Functions
    // ****************************************************

    // Pushes an element on the stack
    public void push(type item)
    {
        // Add to the list
        list.add(item);
    }

    // Get the front of Stack
    public type front()
    {
        // Make sure the stack isn't empty
        if (!empty())
            // Return the front
            return list.get(size()-1);
        else
            throw new EmptyStackException();
    }

    // Remove "pop" from stack. LIFO
    public type pop()
    {
        if (!empty())
            // Remove LIFO
            return list.remove(size()-1);
        else
            // If the stack is already empty
            throw new EmptyStackException();
    }

    // Returns the size of the Stack
    public int size()
    {
        return list.size();
    }

    // Clears the stack
    public void clear()
    {
        list.clear();
    }

    // Output the stack
    @Override
    public String toString()
    {
        return "MyStack contains: " + list.toString();
    }
}// End class MyStack<type>