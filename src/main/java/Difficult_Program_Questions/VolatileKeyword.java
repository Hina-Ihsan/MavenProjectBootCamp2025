package Difficult_Program_Questions;
class SharedData {
    // volatile variable to make it visible to all threads
    volatile boolean running = true;
    	void stop() {
        running = false;
    }
    	void runTask() {
        while (running) {
            System.out.println("Thread is running...");
        }
        System.out.println("Thread stopped.");
    }
}
public class VolatileKeyword {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        			// Start a new thread
        new Thread(() -> data.runTask()).start();
        			// Wait and then stop the thread
        try { Thread.sleep(1000); } catch (Exception e) {}
        data.stop();			//The program starts a thread that prints a message while a volatile variable is true,
    }								//and after 1 second the main thread sets it to false, 
}									//so the thread stops and prints “Thread stopped.”
    		
		
