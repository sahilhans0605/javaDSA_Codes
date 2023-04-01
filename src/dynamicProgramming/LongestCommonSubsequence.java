package dynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static int longestCommonSubsequenceMemoization(String a, String b, int m, int n, int memo[][]) {
//here top down whole matrix is not filled...top down or memoization...in this we are using recursion so recursive overhead may take place but if we don't want to use recursion we use bottom up/tabular approach
        if (m == 0 || n == 0) return 0;
        if (memo[m][n] != -1) return memo[m][n];
        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            memo[m][n] = longestCommonSubsequenceMemoization(a, b, m - 1, n - 1, memo) + 1;
        } else {
            int q1 = longestCommonSubsequenceMemoization(a, b, m - 1, n, memo);
            int q2 = longestCommonSubsequenceMemoization(a, b, m, n - 1, memo);
            memo[m][n] = Math.max(q1, q2);
        }
        return memo[m][n];
    }

    static int longestCommonSubsequenceBottomUp(String a, String b, int m, int n, int dp[][]) {//tabular method...
        //here no value remains -1 we fill whole matrix
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static int longestCommonSubsequence(String a, String b, int m, int n) {
        if (m == 0 || n == 0) return 0;
        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return longestCommonSubsequence(a, b, m - 1, n - 1) + 1;
        } else {
            int q1 = longestCommonSubsequence(a, b, m - 1, n);
            int q2 = longestCommonSubsequence(a, b, m, n - 1);
            return Math.max(q1, q2);
        }
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1, s2, s1.length(), s2.length()));
        int memo[][] = new int[100][100];
        int dp[][] = new int[100][100];//for i==0 and j==0 dp[i][j]=0;

        for (int i = 0; i <= s1.length(); i++) {//<=...is important
            Arrays.fill(memo[i], -1);
        }
        System.out.println(longestCommonSubsequenceMemoization(s1, s2, s1.length(), s2.length(), memo));//space complexity O(N^2)
        System.out.println(longestCommonSubsequenceBottomUp(s1, s2, s1.length(), s2.length(), dp));//space complexity O(N^2)
    }
}