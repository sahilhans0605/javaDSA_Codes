package dynamicProgramming;

public class SpaceOptimisationForLCS {

    static int lcsOptimised(String a, String b, int m, int n, int dp[][]) {
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i % 2][j] = dp[(i + 1) % 2][j - 1] + 1;
                } else {
                    dp[i % 2][j] = Math.max(dp[i % 2][j - 1], dp[(i + 1) % 2][j]);
                }
            }
        }
        return dp[m%2][n];
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bcd";
        int dp[][] = new int[2][s2.length() + 1];
        int ans = lcsOptimised(s1, s2, s1.length(), s2.length(), dp);
        System.out.println(ans);
    }
}
