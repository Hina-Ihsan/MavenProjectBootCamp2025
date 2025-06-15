package Medium_Program_Questions;

public class SecondHighest {

	public static void main(String[] args) {
		int[] numbers = {5, 8, 2, 9, 1};  // Array of numbers

        int first = Integer.MIN_VALUE;   // Highest number
        int second = Integer.MIN_VALUE;  // Second highest number

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > first) {
                second = first;       // Update second
                first = numbers[i];   // Update first
            } else if (numbers[i] > second && numbers[i] != first) {
                second = numbers[i];  // Update second if it's not equal to first
            }
        }

        System.out.println("Second highest number is: " + second);
    }
}
