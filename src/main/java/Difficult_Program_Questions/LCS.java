package Difficult_Program_Questions;

public class LCS {  // Longest Common Subsequence

	// Function to find the length of LCS using dynamic programming
	    public static String findLCS(String s1, String s2) {
	        int m = s1.length();
	        int n = s2.length();

	        // Create a 2D array to store lengths of LCS
	        int[][] dp = new int[m + 1][n + 1];

	        // Fill the dp table
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                // If characters match, add 1 to the diagonal value
	                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1] + 1;
	                } else {
	                    // Otherwise, take the max from left or top
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }

	        // Build the LCS string by tracing back the dp table
	        int i = m, j = n;
	        StringBuilder lcs = new StringBuilder();
	        	while (i > 0 && j > 0) {
	            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
	                // Character is part of LCS
	                lcs.append(s1.charAt(i - 1));
	                i--;
	                j--;
	            } else if (dp[i - 1][j] > dp[i][j - 1]) {
	                i--; // Move up
	            } else {
	                j--; // Move left
	            }
	        }
	        	return lcs.reverse().toString(); // Reverse to get correct order
	    }
	    	// Main method
	    public static void main(String[] args) {
	        String str1 = "ABCBDAB";
	        String str2 = "BDCAB";
	        		String lcs = findLCS(str1, str2);
	        		System.out.println("Longest Common Subsequence: " + lcs);
	    }
	}


