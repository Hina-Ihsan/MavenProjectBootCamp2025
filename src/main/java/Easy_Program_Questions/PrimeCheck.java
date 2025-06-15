package Easy_Program_Questions;

public class PrimeCheck {
 public static void main(String[] args) {
		        int number = 7;  // You can change this to test different numbers
		        boolean isPrime = true;

		        if (number <= 1) {
		            isPrime = false;
		        } else {
		            for (int i = 2; i < number; i++) {
		                if (number % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }
		    }
		}
