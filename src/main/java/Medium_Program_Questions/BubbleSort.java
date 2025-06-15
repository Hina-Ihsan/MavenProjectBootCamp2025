package Medium_Program_Questions;
public class BubbleSort {
public static void main(String[] args) {
		        int[] arr = {5, 2, 8, 3, 1};  // Array to be sorted
		        int n = arr.length;

		        // Bubble sort logic
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = 0; j < n - 1 - i; j++) {
		                // Swap if the current element is greater than the next
		                if (arr[j] > arr[j + 1]) {
		                    int temp = arr[j];           // Swap arr[j] and arr[j+1]
		                    arr[j] = arr[j + 1];
		                    arr[j + 1] = temp;
		                }
		            }
		        }
 // Print the sorted array
		        System.out.println("Sorted array:");
		        for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }
		    }
		}
