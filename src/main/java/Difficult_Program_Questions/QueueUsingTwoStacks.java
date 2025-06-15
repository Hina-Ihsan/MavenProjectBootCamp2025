package Difficult_Program_Questions;
import java.util.Stack;
	class QueueUsingTwoStacks {
	    Stack<Integer> stack1 = new Stack<>();  // For enqueue
	    Stack<Integer> stack2 = new Stack<>();  // For dequeue

	    // Enqueue: Add element to the end of the queue
	    void enqueue(int value) {
	        stack1.push(value);
	        System.out.println(value + " enqueued to queue.");
	    }

	    // Dequeue: Remove element from the front of the queue
	    void dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return;
	        }

	        // If stack2 is empty, move elements from stack1 to stack2
	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }

	        // Pop from stack2
	        int removed = stack2.pop();
	        System.out.println(removed + " dequeued from queue.");
	    }

	    // Peek: View the front element
	    void peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }

	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }

	        System.out.println("Front element is: " + stack2.peek());
	    }

	    // Check if the queue is empty
	    boolean isEmpty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }

	    // Main method to test the queue
	    public static void main(String[] args) {
	        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);

	        queue.peek();     // Should show 10
	        queue.dequeue();  // Removes 10
	        queue.peek();     // Should show 20
	    }
	}


