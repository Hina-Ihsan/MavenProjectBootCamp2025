package Medium_Program_Questions;

public class StringPalindrome {

	public static void main(String[] args) {
	      String word = "madam";   // The word to check
	        String reverse = "";     // To store reversed word

	        // Reverse the string
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reverse = reverse + word.charAt(i);
	        }

	        // Check if original and reversed are same
	        if (word.equals(reverse)) {
	            System.out.println(word + " is a palindrome.");
	        } else {
	            System.out.println(word + " is not a palindrome.");
	        }
	    }
	}
	


