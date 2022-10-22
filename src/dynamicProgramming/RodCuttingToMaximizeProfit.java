package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class RodCuttingToMaximizeProfit {


    static int rodCuttingRecursion(int arr[], int n) {
        int maxProfitTillNow = 0;
        if (n == 0) return 0;
        for (int i = 1; i <= n; i++) {
            int ans = arr[i] + rodCuttingRecursion(arr, n - i);
            maxProfitTillNow = Math.max(maxProfitTillNow, ans);
        }
        return maxProfitTillNow;//this is price but in coin change problem it is number of coins...so we added +1 every time
    }

    static int memo[] = new int[1000];

    static int rodCuttingMemoization(int[] arr, int n) {
        if (memo[n] != -1) return memo[n];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int ans = arr[i] + rodCuttingMemoization(arr, n - i);
            max = Math.max(max, ans);
        }
        memo[n] = max;
        return memo[n];

    }

//    static int rodCuttingDP(int[] arr, int n) {
//        int dp[] = {2, 3, 2, 5};
//        dp[0] = 0;
//        int max = Integer.MIN_VALUE;
//        for (int i = 1; i <= n; i++) {
//            dp[i] = arr[i] + dp[n - i];
////            max = Math.max()
//        }
//    }


    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[100];//0 len ki rod ke liye 2 -----1 len ki rod ke liye 3...toh isme se length reduce krnege
        for (int i = 1; i <= n; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
//        System.out.print(rodCuttingRecursion(arr, n));
//        ---------------------------------------------------------------------------------------------
//        MEMOIZATION::::::::::::::::::::::::::::::::::::::::::::
        Arrays.fill(memo, -1);
        System.out.print(rodCuttingMemoization(arr, n));
    }
}
