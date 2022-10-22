package dynamicProgramming;

public class MaximumSumIncreasingSubsequence {

    static int maximumSumIncreasingSubsequence(int a[]) {
        int dp[] = new int[a.length];
        dp[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            dp[i] = a[i];
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + a[i]);
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
        System.out.println(maximumSumIncreasingSubsequence(a));
    }
}
