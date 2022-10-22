package dynamicProgramming;

import java.util.Arrays;

public class minCoins {

    static public int minCoinsUsingRecursion(int[] a, int n) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, minCoinsUsingRecursion(a, n - a[i]));
        }
        return min + 1;
    }

    static public int minCoinsUsingDP(int a[], int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;//0 value hogi agr n ki toh 0 coins lgenge
        minCoinsDp(a, n, dp);
        return dp[n];
    }

    private static int minCoinsDp(int[] a, int n, int[] dp) {
        if (n < 0) return Integer.MAX_VALUE;
        if (dp[n] != -1) return dp[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            min = Math.min(min, minCoinsDp(a, n - a[i], dp));//total coins mein se ith location waala coin htado
        }
        return dp[n] = min + 1;//this is number of coins so we are adding +1 every time
    }

    public static void main(String[] args) {
        int a[] = {8, 6, 1};
        int n = 15;
        System.out.print(minCoinsUsingRecursion(a, n));
        System.out.print(minCoinsUsingDP(a, n));

    }
}
