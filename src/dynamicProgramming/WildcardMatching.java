package dynamicProgramming;

public class WildcardMatching {

    public static void main(String[] args) {
        String s="aa";
        String p="*";
        System.out.println(isMatch(s,p));
    }

    static public boolean isMatch(String s, String p) {
        int m=s.length();
        int n=p.length();
        boolean dp[][]= new boolean [m+1][n+1];

        dp[0][0]=true;

        for(int i=1;i<=m;i++){//start from 1
            dp[i][0]=false;// length of p=0...means can't match but dp[0][0]=true;//starting from i=1
        }

        for(int j=1;j<=n;j++){
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];//all others will be false by default
                // if prev one is true then it will also be true and if prev is false then prev will also be false...because star can be compared to empty
            }
        }

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==p.charAt(j-1) ||  p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];//i,j-1 means ignoring * and i-1,j means reducing value and keeping * for further characters
                }else{
                    dp[i][j]=false;
                }
            }
        }

        return dp[m][n];

    }
}

