package Difficult_Program_Questions;
//Define a simple Student class
class Student {
 String name;
 int age;

 // Constructor to initialize the student
 Student(String name, int age) {
     this.name = name;
     this.age = age;
 }
}

public class QuickSortObject {

 // Main method to run the program
 public static void main(String[] args) {
     // Create an array of Student objects
     Student[] students = {
         new Student("Alice", 22),
         new Student("Bob", 18),
         new Student("Charlie", 25),
         new Student("David", 20)
     };

     // Call quicksort function
     quickSort(students, 0, students.length - 1);

     // Print sorted student array
     System.out.println("Sorted students by age:");
     for (Student s : students) {
         System.out.println(s.name + " - " + s.age);
     }
 }

 // Quicksort function to sort students by age
 public static void quickSort(Student[] arr, int low, int high) {
     if (low < high) {
         // Find the partition index
         int pi = partition(arr, low, high);

         // Recursively sort left and right parts
         quickSort(arr, low, pi - 1);
         quickSort(arr, pi + 1, high);
     }
 }

 // Partition function to rearrange elements
 public static int partition(Student[] arr, int low, int high) {
     // Choose the last element as pivot
     Student pivot = arr[high];
     int i = low - 1;  // Index of smaller element

     for (int j = low; j < high; j++) {
         // If current element's age is less than pivot's age
         if (arr[j].age < pivot.age) {
             i++;

             // Swap arr[i] and arr[j]
             Student temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }
  // Swap pivot to the correct position
     Student temp = arr[i + 1];
     arr[i + 1] = arr[high];
     arr[high] = temp;

     return i + 1;  // Return pivot index
 }
}

