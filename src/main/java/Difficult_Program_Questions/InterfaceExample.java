package Difficult_Program_Questions;
interface Animal {
    void sound();  // method without body
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
		//In this example, Animal is an interface with a method sound(). 
		//The class Dog implements the interface and gives the method its behavior.  
