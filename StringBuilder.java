public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append a string to the end
        sb.append(" World");

        // Insert a string at a specified index
        sb.insert(6, "Beautiful ");

        // Replace a portion of the string with another string
        sb.replace(6, 15, "Amazing");

        // Delete a portion of the string
        sb.delete(6, 13);

        // Reverse the entire string
        sb.reverse();

        // Convert the StringBuilder to a String
        String finalString = sb.toString();

        // Print the final string
        System.out.println(finalString);
    }
}
