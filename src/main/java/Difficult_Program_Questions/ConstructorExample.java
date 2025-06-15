package Difficult_Program_Questions;
class Person {
    String name;

    // Constructor to set the name
    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Person p = new Person("Inam");  // Create object and call constructor
        p.display();
    }
}
    //In this example, the constructor sets the name when the object is created.
