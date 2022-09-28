package dynamicProgramming;

public class FibonacciProblemUsingDP {

    static int fib(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        fibDp(n, dp);
        return dp[n];//last...index hoga na n...humne dp n+1 index ka array bnaya hai
    }

    private static int fibDp(int n, int[] dp) {
        if (dp[n] != -1) return dp[n];//this call saves overlapping call..mtlb jiski value -1 nhi hai use return krdo ki iski value hai
        return dp[n] = fibDp(n - 1, dp) + fibDp(n - 2, dp);
    }

    public static void main(String[] args) {
//        Fibo... 1+2+4+8....2^n
    }
}
