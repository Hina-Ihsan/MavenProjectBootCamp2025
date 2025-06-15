package Medium_Program_Questions;

public class ReverseString {

	public static void main(String[] args) {
		 String word = "hello";    // The string to reverse
	        String reversed = "";     // To store the reversed string

	        // Reverse the string using a loop
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reversed = reversed + word.charAt(i);  // Add each character from end
	        }

	        // Print the reversed string
	        System.out.println("Reversed string: " + reversed);
	    }
	}
