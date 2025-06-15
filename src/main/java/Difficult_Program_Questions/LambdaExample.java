package Difficult_Program_Questions;
//Functional interface with one method
interface Message {
 void say();
}

public class LambdaExample {
 public static void main(String[] args) {
     // Lambda expression to define the say() method
     Message msg = () -> System.out.println("Hello from Lambda!");
     
     // Calling the method
     msg.say();
 }
}
		//()-> System.out.println("Hello from Lambda!") is the lambda expression that gives the method behavior.