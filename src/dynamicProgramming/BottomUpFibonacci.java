package dynamicProgramming;

import java.util.Arrays;

public class BottomUpFibonacci {

//    Bottom up approach means the stack will start filling from bottom..0 then 1 then 2...
//    see in this...array starts storing value from dp[2] i.e bottom...


    static int fib(int n) {
        int dp[] = new int[1000];//dp array bnake store krliya
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {//i==2 se shuru kiya gya hai
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.print(fib(100));
    }
}
