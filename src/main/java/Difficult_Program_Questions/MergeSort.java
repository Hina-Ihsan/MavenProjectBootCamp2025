package Difficult_Program_Questions;
public class MergeSort {
    // Main method to test the merge sort
	    public static void main(String[] args) {
	        int[] arr = {38, 27, 43, 3, 9, 82, 10};

	        System.out.println("Original Array:");
	        printArray(arr);

	        // Call merge sort
	        mergeSort(arr, 0, arr.length - 1);

	        System.out.println("Sorted Array:");
	        printArray(arr);
	    }

	    // Merge sort function (recursive)
	    public static void mergeSort(int[] arr, int left, int right) {
	        if (left < right) {
	            // Find the middle point
	            int mid = (left + right) / 2;

	            // Recursively sort first and second halves
	            mergeSort(arr, left, mid);
	            mergeSort(arr, mid + 1, right);

	            // Merge the sorted halves
	            merge(arr, left, mid, right);
	        }
	    }

	    // Merge function to combine two sorted halves
	    public static void merge(int[] arr, int left, int mid, int right) {
	        // Sizes of two subarrays
	        int n1 = mid - left + 1;
	        int n2 = right - mid;

	        // Create temp arrays
	        int[] leftArray = new int[n1];
	        int[] rightArray = new int[n2];

	        // Copy data into temp arrays
	        for (int i = 0; i < n1; i++)
	            leftArray[i] = arr[left + i];
	        for (int j = 0; j < n2; j++)
	            rightArray[j] = arr[mid + 1 + j];

	        // Merge the temp arrays
	        int i = 0, j = 0, k = left;

	        // Compare elements and copy the smaller one
	        while (i < n1 && j < n2) {
	            if (leftArray[i] <= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;          }
	            k++;          }            // Copy remaining elements (if any)
	        while (i < n1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }
	        while (j < n2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;   }}
	   // Function to print the array
	    public static void printArray(int[] arr) {
	        for (int value : arr)
	            System.out.print(value + " ");
	        System.out.println();
	    }
	}


