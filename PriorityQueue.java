import java.util.PriorityQueue;

public class SimplePriorityQueueExample {

    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add some integers to the queue
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);
        priorityQueue.add(15);

        // Print the elements of the queue
        System.out.println("Elements in the priority queue: " + priorityQueue);

        // Process the elements in priority order
        System.out.println("Processing elements in priority order:");
        while (!priorityQueue.isEmpty()) {
            Integer number = priorityQueue.poll();
            System.out.println(number);
        }
    }
}