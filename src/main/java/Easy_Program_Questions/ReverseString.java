package Easy_Program_Questions;

public class ReverseString {

	public static void main(String[] args) {
		 String word = "hello";  // The string to reverse
	        String reverse = "";    // To store the reversed string

	        // Loop to get characters from end to start
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reverse = reverse + word.charAt(i);  // Add each character to reverse
	        }

	        System.out.println("Reversed string: " + reverse);  // Print reversed string
	    }
	}
	


