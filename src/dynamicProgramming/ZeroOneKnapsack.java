package dynamicProgramming;

public class ZeroOneKnapsack {

// Tabulation :
//
//    static int knapSack(int W, int wt[], int val[], int n)
//    {
//        int dp[][]=new int[n+1][W+1];
//
//        for(int i=0;i<=n;i++){
//            dp[i][0]=0;
//        }
//
//        for(int j=0;j<=W;j++){
//            dp[0][j]=0;
//        }
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=W;j++){
//                if(wt[i-1]<=j){
//                    int ans1=val[i-1]+dp[i-1][j-wt[i-1]];
//                    int ans2=dp[i-1][j];
//                    dp[i][j]=Math.max(ans1,ans2);
//                }else{
//                    dp[i][j]=dp[i-1][j];
//                }
//            }
//        }
//        return dp[n][W];
//    }
    // Memoization
    //Function to return max value that can be put in knapsack of capacity W.


    // static int knapSackHelp(int W,int wt[],int val[],int n,int dp[][]){
    //     if(W==0 || n==0){
    //         return 0;
    //     }

    //     if(dp[n][W]!=-1){
    //         return dp[n][W];
    //     }

    //     if(wt[n-1]<=W){
    //         int ans1=val[n-1]+knapSackHelp(W-wt[n-1],wt,val,n-1,dp);
    //         int ans2=knapSackHelp(W,wt,val,n-1,dp);
    //         return dp[n][W]=Math.max(ans1,ans2);
    //     }else{
    //         return dp[n][W]=knapSackHelp(W,wt,val,n-1,dp);
    //     }


    // }



    // static int knapSack(int W, int wt[], int val[], int n)
    // {
    //      // your code here
    // //   Recursion
    //     //  if(W==0 || n==0){
    //     //      return 0;
    //     //  }
    //     //  int max=Integer.MIN_VALUE;
    //     //      if(wt[n-1]<=W){
    //     //         int cur1=val[n-1]+knapSack(W-wt[n-1],wt,val,n-1);
    //     //         int cur2=knapSack(W,wt,val,n-1);
    //     //         return Math.max(cur1,cur2);
    //     //      }else{
    //     //          return knapSack(W,wt,val,n-1);
    //     //      }

    //     // Memoization:

    //     int dp[][]=new int[n+1][W+1];
    //     for(int i=0;i<dp.length;i++){
    //         for(int j=0;j<dp[0].length;j++){
    //             dp[i][j]=-1;
    //         }
    //     }

    //     return knapSackHelp(W,wt,val,n,dp);
    // }
}


// unbounded knapsack
//class Solution{
//    static int knapSack(int N, int W, int val[], int wt[])
//    {
//        // code here
//        int dp[][]= new int[N+1][W+1];
//
//        for(int i=0;i<=N;i++){
//            dp[i][0]=0;
//        }
//
//        for(int j=0;j<=W;j++){
//            dp[0][j]=0;
//        }
//
//        for(int i=1;i<=N;i++){
//            for(int j=1;j<=W;j++){
//                if(wt[i-1]<=j){
//                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
//                }else{
//                    dp[i][j]=dp[i-1][j];
//                }
//            }
//        }
//
//        return dp[N][W];
//    }
//}