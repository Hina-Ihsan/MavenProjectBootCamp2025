package Difficult_Program_Questions;
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    void move() {
        super.move();  // Call parent class method
        System.out.println("Car is driving");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
    }
}
			//The super keyword is used to call the move() method from the parent class
			//Vehicle before running the child class Car's own method.

