import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> countrySet = new TreeSet<>();

        // Add country names to the TreeSet
        countrySet.add("India");
        countrySet.add("USA");
        countrySet.add("China");
        countrySet.add("Australia");
        countrySet.add("Canada");

        // Attempt to add duplicate elements
        countrySet.add("India");
        countrySet.add("Australia");

        // Display the TreeSet elements (in sorted order)
        System.out.println("TreeSet elements:");
        for (String country : countrySet) {
            System.out.println(country);
        }

        // Check if an element exists in the TreeSet
        boolean containsIndia = countrySet.contains("India");
        System.out.println("TreeSet contains 'India': " + containsIndia);

        // Remove an element from the TreeSet
        countrySet.remove("China");
        System.out.println("TreeSet after removing 'China':");
        for (String country : countrySet) {
            System.out.println(country);
        }

        // Check the size of the TreeSet
        int size = countrySet.size();
        System.out.println("Size of TreeSet: " + size);

        // Clear all elements from the TreeSet
        countrySet.clear();
        System.out.println("TreeSet after clearing all elements:");
        System.out.println(countrySet);
    }
}
