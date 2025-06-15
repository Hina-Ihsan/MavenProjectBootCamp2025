package Program_Questions;
public class PrintNumbers {
    public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Print the current number
            System.out.print(i);
            
            // Check if number is divisible by 5
            if (i % 5 == 0) {
                System.out.print(" Divisible by 5");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
