package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class RodCuttingProblem {

    int rodCuttingProblemUsingRecursion(int[] price, int n) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MIN_VALUE;
        int maxPrice = -1;
        for (int i = 0; i < price.length; i++) {
            maxPrice = Math.max(maxPrice, price[i] + rodCuttingProblemUsingRecursion(price, n - i - 1));
        }
        return maxPrice;
    }

    int rodCuttingProblemUsingDP(int[] price, int n) {
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        rodCuttingDp(price, n, dp);
        return dp[n];
    }

    private int rodCuttingDp(int price[], int n, int dp[]) {
        if (dp[n] != -1) return dp[n];
        int max = -1;
        for (int i = 0; i < price.length; i++) {
            max = Math.max(max, rodCuttingDp(price, n - i - 1, dp));
        }
        return dp[n] = max;
    }

    public static void main(String[] args) {

    }
}
