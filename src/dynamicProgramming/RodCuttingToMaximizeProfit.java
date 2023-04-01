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

//    Tabulation1
    public int cutRod(int price[], int n) {
        int lengthRod[]= new int[n];
        for(int i=0;i<lengthRod.length;i++){
            lengthRod[i]=i+1;
        }
        // Tabulation
        int dp[][]= new int[price.length+1][lengthRod.length+1];

        for(int i=0;i<=price.length;i++){
            dp[i][0]=0;//if(n==0 || W==0)return 0;
        }

        for(int j=0;j<=lengthRod.length;j++){
            dp[0][j]=0; //if(n==0 || W==0)return 0;
        }

        for(int i=1;i<=price.length;i++){
            for(int j=1;j<=lengthRod.length;j++){
                if(lengthRod[i-1]<=j){
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-lengthRod[i-1]],dp[i-1][j]);//same as unbounded knapsack as it can repeat...cuts...
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[price.length][n];
    }

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
