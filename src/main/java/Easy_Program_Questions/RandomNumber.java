package Easy_Program_Questions;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rand = new Random();  // Create Random object

        int randomNumber = rand.nextInt(100) + 1;  // Generate number from 1 to 100

        System.out.println("Random number between 1 and 100: " + randomNumber);
    }
}