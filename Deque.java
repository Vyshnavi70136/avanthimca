import java.util.Deque;

public class SimpleDequeExample {

    public static void main(String[] args) {
        // Create a Deque using LinkedList
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque
        deque.addFirst("First Element");
        deque.addLast("Second Element");
        deque.addFirst("Third Element");
        deque.addLast("Fourth Element");

        // Display the deque
        System.out.println("Deque after additions: " + deque);

        // Remove elements from the deque
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();

        // Display removed elements
        System.out.println("Removed from front: " + removedFirst);
        System.out.println("Removed from back: " + removedLast);

        // Display the deque after removals
        System.out.println("Deque after removals: " + deque);

        // Peek at the elements without removing them
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();

        // Display the peeked elements
        System.out.println("Peek at front: " + peekFirst);
        System.out.println("Peek at back: " + peekLast);

        // Iterate through the deque
        System.out.println("Iterating through the deque:");
        for (String element : deque) {
            System.out.println(element);
        }
    }
}
