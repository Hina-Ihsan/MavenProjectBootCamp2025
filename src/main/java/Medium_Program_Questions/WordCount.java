package Medium_Program_Questions;

public class WordCount {

	public static void main(String[] args) {
		String sentence = "Hello world this is Java";  // The given string

        int count = 1;  // Start with 1 word (if string is not empty)

        // Loop through the string characters
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;  // Increase count when space found
            }
        }

        System.out.println("Number of words: " + count);
    }
}
