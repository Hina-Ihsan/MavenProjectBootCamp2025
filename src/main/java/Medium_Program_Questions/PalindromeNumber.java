package Medium_Program_Questions;

public class PalindromeNumber {

	public static void main(String[] args) {
		 int number = 121;  // The number to check
	        int original = number;  // Store original number
	        int reverse = 0;

	        // Reverse the number
	        while (number > 0) {
	            int digit = number % 10;       // Get last digit
	            reverse = reverse * 10 + digit; // Build reversed number
	            number = number / 10;          // Remove last digit
	        }

	        // Check if original and reversed numbers are same
	        if (original == reverse) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }
	    }
	}


