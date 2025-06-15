package Medium_Program_Questions;
	public class BinarySearch {
			public static void main(String[] args) {
				int[] arr = {1, 3, 5, 7, 9};  // Sorted array
					int key = 5;                  // Number to search
						int low = 0;
							int high = arr.length - 1;
								boolean found = false;
// Binary search logic
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;  // Search in left half
            } else {
                low = mid + 1;   // Search in right half
            }
        }
        		if (!found) {
        			System.out.println("Element not found.");
        }
	}
}
