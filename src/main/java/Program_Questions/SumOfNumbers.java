package Program_Questions;
public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0; // variable to store the sum
        
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            sum = sum + i; // add current number to sum
        }
        
        // Print the total sum
        System.out.println("Sum of first 100 numbers is: " + sum);
    }
}

