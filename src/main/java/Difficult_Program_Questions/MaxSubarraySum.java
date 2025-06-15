package Difficult_Program_Questions;
	public class MaxSubarraySum {
			// Function to find maximum subarray sum
	    public static int maxSubArraySum(int[] arr) {
	        int maxSoFar = arr[0];   // Stores the maximum sum found so far
	        int currentSum = arr[0]; // Stores the current subarray sum

	        for (int i = 1; i < arr.length; i++) {
	            // If currentSum is negative, start new subarray from current element
	            currentSum = Math.max(arr[i], currentSum + arr[i]);

	            // Update maxSoFar if currentSum is greater
	            maxSoFar = Math.max(maxSoFar, currentSum);
	        }

	        return maxSoFar;
	    }
	    		// Main method
	    public static void main(String[] args) {
	        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

	        int maxSum = maxSubArraySum(arr);
	        System.out.println("Maximum Subarray Sum is: " + maxSum);
	    }
	}


