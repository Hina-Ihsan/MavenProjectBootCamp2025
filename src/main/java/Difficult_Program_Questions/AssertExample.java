package Difficult_Program_Questions;
public class AssertExample {
    public static void main(String[] args) {
        int number = 5;
        assert number > 0 : "Number must be positive";  // Check condition

        System.out.println("Number is " + number);
    }
}
		//If number is not greater than 0, the program will stop 
		//and show the message "Number must be positive".