public class FactorialCalculator {

    // Synchronized method to calculate factorial
    public synchronized long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();

        // Creating a thread to calculate factorial
        Thread thread1 = new Thread(() -> {
            int number = 5;
            long result = calculator.factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        });

        // Creating another thread to calculate factorial
        Thread thread2 = new Thread(() -> {
            int number = 6;
            long result = calculator.factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        });

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
