package dynamicProgramming;

public class TargetSumSubset {

    static boolean targetSumSubset(int sum, int arr[], int n){
        boolean dp[][]= new boolean[n+1][sum+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                int val=arr[i-1];
                if(val<=j && dp[i-1][j-val]){//including weights
                    dp[i][j]=true;//else it will remain false
                }else if(dp[i-1][j]){//not including..then also it will work
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[]args){
        int arr[]={4,2,7,1,3};
        int sum=10;

        System.out.println(targetSumSubset(sum,arr,arr.length));
    }
}
