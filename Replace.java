package anudip;
import java.util.Scanner;
class ReplaceChar {
	public static void main(String[] args) {
		System.out.print("Enter Mobile Number:");
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Convert the string to a character array
        char[] arr = str.toCharArray();
        // Determine the length of the string
        int length = str.length();
        //print all but the last four characters as 'X'
        for (int i = 0; i < length - 4; i++) {
        	arr[i] = 'X';
		  }
		// Convert the character array back to a string
        String s = new String(arr);
        // Printing the Mobile number as required
        System.out.println("output:" +s);
        // Close the Scanner
        sc.close();
		    }
	}