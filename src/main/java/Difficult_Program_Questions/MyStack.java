package Difficult_Program_Questions;
class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyStack {
    StackNode top;

    MyStack() {
        top = null;
    }

    void push(int value) {
        StackNode newNode = new StackNode(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }
    	int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    	boolean isEmpty() {
        return top == null;
    }
    	public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is " + stack.peek());
    }
}
		//This program implements a stack using a linked list where nodes are added and removed from the top.