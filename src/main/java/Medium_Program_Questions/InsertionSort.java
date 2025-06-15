package Medium_Program_Questions;
	public class InsertionSort {
		public static void main(String[] args) {
			int[] arr = {5, 3, 8, 1, 2};  // Array to be sorted
			int n = arr.length;

        // Insertion sort logic
			for (int i = 1; i < n; i++) {
				int key = arr[i];      // Current element
					int j = i - 1;

            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift element to right
                j = j - 1;
            }
            	arr[j + 1] = key;  // Insert key in correct position
        }
					// Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

	