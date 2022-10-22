package dynamicProgramming;

import java.util.Arrays;

public class MinimumJumpsToReachTheEnd {
    static int min = Integer.MAX_VALUE;

    static int minimumJumpsDP(int a[], int i, int dp[]) {

        if (i >= a.length - 1) return 0;//means ab vo end pe ya end se aage jaa chuka hai...now use 0 steps lgenge....
        if (a[i] == 0) return Integer.MAX_VALUE;//;large value....because vo end pe phuch hi nhi skta
        for (int j = 1; j <= a[i]; j++) {
            min = Math.min(min, minimumJumpsDP(a, i + j, dp) + 1);
            dp[i] = min;
        }
        return dp[i];
    }

    public static void main(String[] args) {
        int dp[] = new int[100];
        Arrays.fill(dp, -1);
        int a[] = {3, 2, 4, 1, 3, 5, 1, 1, 2};
        System.out.print(minimumJumpsDP(a, 5, dp));//i=0 because we want to reach to the end from 0th position
    }
}
