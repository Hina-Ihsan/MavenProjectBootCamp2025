package Difficult_Program_Questions;
class Device {
    void turnOn() {
        System.out.println("Device is turning on");
    }
}

class Phone extends Device {
    void turnOn() {
        System.out.println("Phone is turning on");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Device d;        // Parent class reference
        d = new Phone(); // Child class object
        d.turnOn();      // Calls Phone's turnOn() method
    }
}
		//d is a Device type but calls the turnOn() method of Phone because of polymorphism.