package Difficult_Program_Questions;
public class RotatedBinarySearch {
	  // Function to perform binary search in a rotated sorted array
	    public static int search(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        // Binary search loop
	        while (left <= right) {
	            int mid = (left + right) / 2;

	            // Check if mid is the target
	            if (arr[mid] == target) {
	                return mid;
	            }

	            // Left half is sorted
	            if (arr[left] <= arr[mid]) {
	                // Check if target lies in this half
	                if (target >= arr[left] && target < arr[mid]) {
	                    right = mid - 1; // search left
	                } else {
	                    left = mid + 1; // search right
	                }
	            }
	            // Right half is sorted
	            else {
	                // Check if target lies in this half
	                if (target > arr[mid] && target <= arr[right]) {
	                    left = mid + 1; // search right
	                } else {
	                    right = mid - 1; // search left
	                }
	            }}
	 
	        return -1; // Element not found
	    }
   // Main method
	    public static void main(String[] args) {
	        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
	        int target = 0;

	        int result = search(arr, target);

	        if (result != -1) {
	            System.out.println("Element found at index: " + result);
	        } else {
	            System.out.println("Element not found in the array.");
	        } 
	    }
}

