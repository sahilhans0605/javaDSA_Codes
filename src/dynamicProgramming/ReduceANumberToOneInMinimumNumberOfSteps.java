package dynamicProgramming;

import java.util.Arrays;

public class ReduceANumberToOneInMinimumNumberOfSteps {

    static int reduceUsingRecursion(int n) {
        if (n == 1) return 0;
        int q1 = Integer.MAX_VALUE;
        int q2 = Integer.MAX_VALUE;
        int q3 = Integer.MAX_VALUE;
        if (n % 3 == 0)
            q1 = 1 + reduceUsingRecursion(n / 3);//we are adding 1 because 1 step of dividing by 2 is done here
        if (n % 2 == 0) q2 = 1 + reduceUsingRecursion(n / 2);
        q3 = 1 + reduceUsingRecursion(n - 1);
        return Math.min(q1, Math.min(q2, q3));
    }

    static int[] memo = new int[10000];

    static int bottomUpApproach(int n) {//bottom up approach mein function ka koi kaam nhi hai function ko stack mein nhi daalna padta baar baar...aise hi ho jaata hai
        int dp[] = new int[10000];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
//        see hume i/2 ki value chahiye...i/3 ki and i-1 ki bhi chahiye....toh humne 0---3 tk ke ans dp mein store krdiye ab aage ke ans hum for loop se store krwalenge
        for (int i = 4; i <= n; i++) {
            int q1 = Integer.MAX_VALUE;
            int q2 = Integer.MAX_VALUE;
            int q3 = Integer.MAX_VALUE;
            if (i % 3 == 0)
                q1 = 1 + dp[i / 3];//we are adding 1 because 1 step of dividing by 2 is done here
            if (i % 2 == 0) q2 = 1 + dp[i / 2];
            q3 = 1 + dp[i - 1];
            dp[i] = Math.min(q1, Math.min(q2, q3));
        }
        return dp[n];
    }

    static int reduceUsingMemoization(int n) {//top down approach
        if (memo[n] != -1) return memo[n];
        memo[1] = 0;
        int q1 = Integer.MAX_VALUE;
        int q2 = Integer.MAX_VALUE;
        int q3 = Integer.MAX_VALUE;
        if (n % 3 == 0)
            q1 = 1 + reduceUsingMemoization(n / 3);//we are adding 1 because 1 step of dividing by 2 is done here
        if (n % 2 == 0) q2 = 1 + reduceUsingMemoization(n / 2);
        q3 = 1 + reduceUsingMemoization(n - 1);
        memo[n] = Math.min(q1, Math.min(q2, q3));
        return memo[n];
    }

    public static void main(String[] args) {
        Arrays.fill(memo, -1);
//        System.out.print(reduceUsingMemoization(9999));
        System.out.print(bottomUpApproach(9999));

    }
}
