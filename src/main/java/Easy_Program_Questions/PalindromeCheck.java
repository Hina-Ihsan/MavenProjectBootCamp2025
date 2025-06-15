package Easy_Program_Questions;

public class PalindromeCheck {

	public static void main(String[] args) {
	    String word = "school";  // The word we want to check
        String reverse = "";     // To store the reversed word

        // Reverse the word using a loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // Check if original word and reversed word are the same
        if (word.equals(reverse)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

	


