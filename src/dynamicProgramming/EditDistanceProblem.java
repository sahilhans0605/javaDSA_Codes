package dynamicProgramming;

import java.util.Arrays;

public class EditDistanceProblem {

    static int editDistanceRecursion(String a, String b, int m, int n) {
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }

        if (a.charAt(m - 1) == b.charAt(n - 1)) {//iss waale case mein operations krne hai....naa ki elements count krne hai...toh operations count krenge...naa ki...characters
            return editDistanceRecursion(a, b, m - 1, n - 1);
        } else {
            return Math.min(Math.min(editDistanceRecursion(a, b, m - 1, n), editDistanceRecursion(a, b, m - 1, n - 1)), editDistanceRecursion(a, b, m, n - 1)) + 1;
//            ek ek kam hoga m-1 n-1 krte krte
//            +1 because atleast one operation will be performed
        }
    }


    static int editDistanceBottomUp(String a, String b, int m, int n) {
        int dp[][] = new int[100][100];
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                }
            }
        }
        return dp[m][n];
    }

    static int memo[][];

    static int editDistanceTopDown(String a, String b, int m, int n, int memo[][]) {
        if (m == 0) return n;
        if (n == 0) return m;

        if (memo[m][n] != -1) return memo[m][n];
        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            memo[m][n] = editDistanceTopDown(a, b, m - 1, n - 1, memo);
        } else {
            memo[m][n] = Math.min(Math.min(editDistanceRecursion(a, b, m - 1, n), editDistanceRecursion(a, b, m - 1, n - 1)), editDistanceRecursion(a, b, m, n - 1)) + 1;
        }
        return memo[m][n];
    }


    public static void main(String[] args) {
        String s1 = "bcbd";
        String s2 = "bcfcef";
        memo = new int[100][100];
        for (int i = 0; i <= s1.length(); i++) {
            Arrays.fill(memo[i], -1);
        }
//        int ans = editDistanceRecursion(s1, s2, s1.length(), s2.length());
        int ans1 = editDistanceTopDown(s1, s2, s1.length(), s2.length(), memo);
//        System.out.println(ans);
        System.out.println(ans1);
        int ans2 = editDistanceBottomUp(s1, s2, s1.length(), s2.length());
        System.out.println(ans2);
    }
}