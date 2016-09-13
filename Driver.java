// Stephen Reader
// 10552526

// Import
import java.util.*;

public class Driver
{
    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<>();

        // Add numbers to the List
        nums.add(5);
        nums.add(79);
        nums.add(72);
        nums.add(88);

        // TESTING
        // **********************************************************

        // Initialize new stack.
        MyStack stack = new MyStack(nums);

        // Show that numbers were added to stack
        System.out.println(stack);

        // Pop 2
        stack.pop();
        stack.pop();
        System.out.println("Popped 2, now " + stack);


        // Add some more stuff to the stack
        stack.push(null);
        stack.push("f");
        stack.push(11);
        System.out.println("After adding 3 new items now " + stack);

        // Lets see the size then pop one and make sure the size of stack changes
        System.out.println("Number of elements in the stack: " + stack.size());
        stack.pop();
        System.out.println("Number of elements in the stack after pop: " + stack.size() + " ...Now " +stack);

        // Make sure that the front gets the front pop one and check front again
        System.out.println("Front of stack: " + stack.front());
        stack.pop();
        System.out.println("Front of stack after pop: " + stack.front());

        // Lets clear the stack, and then push some new stuff onto it
        stack.clear();
        stack.push(22);
        stack.push(134);
        stack.push(31);
        stack.push(77);
        System.out.println("Cleared stack and added some new stuff. Now " + stack);




        // This area was me trying to figure out how in the world to make changeImpl work.
        List<Integer> d = new LinkedList<>();
        //System.out.println(stack);
        //System.out.println(stack.list.getClass());
        Collection s = stack.changeImpl(d);

        //System.out.println(stack.list.getClass());
    }
}// End class Driver