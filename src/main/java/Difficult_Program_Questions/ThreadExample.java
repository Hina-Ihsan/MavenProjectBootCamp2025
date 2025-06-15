package Difficult_Program_Questions;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t = new MyThread();  // Create a thread
        t.start();                    // Start the thread
    }
}
   			//This program creates a thread that prints a message. 
			//When start() is called, the thread runs the run() method independently.
