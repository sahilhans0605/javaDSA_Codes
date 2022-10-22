package dynamicProgramming;

public class LongestIncreasingSubsequence {

    static int longestIncreasingSubsequence(int a[]) {
        int dp[] = new int[a.length];
        dp[0] = 1;
        for (int i = 1; i < a.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max = Integer.MIN_VALUE;

        for (int e : dp) {
            max = Math.max(e, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int a[] = {4, 6, 1, 3, 5, 9, 8};
        System.out.println(longestIncreasingSubsequence(a));
    }
}
