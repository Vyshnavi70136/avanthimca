import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Creating an ArrayList to hold Integer values
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding integers to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);

        // Retrieving and printing all values from the ArrayList
        System.out.println("ArrayList contents: " + numbers);

        // Getting and printing the index of the first occurrence of an element
        int firstIndex = numbers.indexOf(20);
        System.out.println("First index of element 20: " + firstIndex);

        // Getting and printing the index of the last occurrence of an element
        int lastIndex = numbers.lastIndexOf(20);
        System.out.println("Last index of element 20: " + lastIndex);

        // Retrieving and printing a value at a specific index
        int valueAtIndex2 = numbers.get(2);
        System.out.println("Value at index 2: " + valueAtIndex2);
    }
}
