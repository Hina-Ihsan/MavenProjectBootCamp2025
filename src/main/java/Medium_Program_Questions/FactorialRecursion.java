package Medium_Program_Questions;
public class FactorialRecursion {
// Method to find factorial using recursion
public static int factorial(int n) {
    if (n == 0) {
        return 1;  // Base case: factorial of 0 is 1
    } else {
        return n * factorial(n - 1);  // Recursive call
    }
}

public static void main(String[] args) {
    int number = 5;  // Number to find factorial of
    int result = factorial(number);  // Call the method

    System.out.println("Factorial of " + number + " is " + result);
}
}

	


