package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class CatalansNumber {

    static int catalansNumberRecursion(int n) {
        if (n == 0 || n == 1) return 1;
        int ans=0;//everytime for every c0,c1,c2...there will be a new ans initialization to zero and we will add it
        for (int i = 0; i <= n - 1; i++) {
            ans+= catalansNumberRecursion(i)*catalansNumberRecursion(n-i-1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
//        System.out.println(catalansNumberRecursion(n));
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(catalansNumberMemoization(n,dp));
        System.out.println(catalansNumberTabulation(n));
    }

    private static int catalansNumberTabulation(int n) {
        int dp[]= new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){//like we want to find ctalan number from 2--->n we will calculate for each one of them
//            it is not like fibonacci...in that we have the values but in this in case of recursion also we are using for loop
            for(int j=0;j<=i-1;j++){
                dp[i]+=dp[j]*dp[i-j-1];//+=
            }
        }
        return dp[n];
    }

    private static int catalansNumberMemoization(int n,int []dp) {
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n==0 || n==1)return 1;
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans+=catalansNumberMemoization(i,dp)*catalansNumberMemoization(n-i-1,dp);//here they are calling for difference n's example C4 will call for c0 and c3
            dp[n]=ans;
        }
        return dp[n];
    }
}
