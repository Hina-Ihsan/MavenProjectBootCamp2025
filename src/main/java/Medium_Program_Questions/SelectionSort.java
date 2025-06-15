package Medium_Program_Questions;
	public class SelectionSort {
		public static void main(String[] args) {
			int[] arr = {5, 3, 8, 1, 2};  // Array to be sorted
			int n = arr.length;
			// Selection sort logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  // Assume current index has the minimum
            // Find the index of the smallest element in the rest of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the smallest element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        // Print the sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
