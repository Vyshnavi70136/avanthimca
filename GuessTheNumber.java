import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Create a Random object to generate a random number
        Random random = new Random();
        
        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");
        
        int userGuess = 0;  // Variable to store user's guess
        while (userGuess != numberToGuess) {
            // Prompt the user for their guess
            System.out.print("Enter your guess: ");
            
            // Check if the input is a valid integer
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                
                // Check if the guess is within the valid range
                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please enter a number between 1 and 100.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number!");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                // Clear the invalid input
                scanner.next();
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
