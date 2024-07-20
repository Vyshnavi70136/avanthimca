public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reverse = 0;
 
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
 
        return originalNum == reverse;
    }
 
    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}