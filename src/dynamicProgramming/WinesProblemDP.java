package dynamicProgramming;

import java.util.Arrays;
//TC without memoization is 2^n
//TC with memoization is n^2
public class WinesProblemDP {
    static int memo[][] = new int[100][100];

//    static int maxProfitBottomUP(int ){
//
//    }.....abhi nhi hua

    static int maxProfit(int be, int en, int[] arr, int year) {
        if (be > en) {
            return 0;
        }
        if (memo[be][en] != -1) {
            return memo[be][en];
        }
        int q1 = arr[be] * year + maxProfit(be + 1, en, arr, year + 1);//sell from beg
        int q2 = arr[en] * year + maxProfit(be, en - 1, arr, year + 1);//sell from end
        int ans = Math.max(q1, q2);
        memo[be][en] = ans;
        return memo[be][en];
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 4};

        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo.length; j++) {
                memo[i][j] = -1;
            }
        }
        int ans = maxProfit(0, arr.length - 1, arr, 1);
        System.out.println(ans);
    }
}
