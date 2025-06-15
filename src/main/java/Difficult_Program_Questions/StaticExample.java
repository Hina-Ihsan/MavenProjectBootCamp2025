package Difficult_Program_Questions;
class MyClass {
    static int count = 0;  // static variable shared by all objects

    static void showCount() {  // static method
        System.out.println("Count: " + count);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        MyClass.count = 5;       // Access static variable without object
        MyClass.showCount();     // Call static method without object
    }
}
			//In this example, count and showCount() belong to the class MyClass 
			//and can be used without creating an object.
