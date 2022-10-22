package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

//Bottom up approach mein hum bottom se shuru krte hai phle 0 fir 1 fir 2...n
//top down approach mein top se shuru krte hai 5 ko bharne ke liye 4 chahiye isliye 4 bhrenge
//table bhri humesha bottom up hi hoti hai
public class FibonacciProblemUsingDP {
    static int memo[] = new int[1000];
//In memoization function calls ho rhe hai...stack bhar skte hai...
//    in this case starts filling from top i.e dp[5]

    static int fib(int n) {
        if (memo[n] != -1) return memo[n];//as we already have stored value of this
        int ans = fib(n - 1) + fib(n - 2);//in this case we are using recursion
        memo[n] = ans;
        return ans;
    }

    public static void main(String[] args) {
        int n = new Scanner((System.in)).nextInt();
        Arrays.fill(memo, -1);
        memo[0] = 0;
        memo[1] = 1;
        System.out.println(fib(n));
    }
}