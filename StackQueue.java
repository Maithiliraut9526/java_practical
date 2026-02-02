import java.util.*;

public class StackQueue{
    public static void main(String[] args) {
        // Stack (LIFO)
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Queue (FIFO)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue: " + queue);
        System.out.println("Dequeue: " + queue.remove());
        System.out.println("Queue after dequeue: " + queue);
    }
}