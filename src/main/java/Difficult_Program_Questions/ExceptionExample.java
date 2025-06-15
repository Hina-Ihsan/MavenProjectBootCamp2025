package Difficult_Program_Questions;
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;  // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
            
         
            //In this example, dividing by 0 causes an ArithmeticException.
            //The catch block handles the error and prints a message instead of crashing the program.
        }
    }
}

