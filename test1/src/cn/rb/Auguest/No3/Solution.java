package cn.rb.Auguest.No3;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int longestPalindromeSubseq(String s){
        int n=s.length();
        if(n==0){
            return 0;
        }
        int[][] dp=new int[n][n];
        for (int i = 0; i <n ; i++) {
            dp[i][i]=1;
        }
        for (int i=0;i<n;i++){
            for (int j = 0; j <i ; j++) {
                dp[i][j]=0;
            }
        }

        for (int i = n-1; i >=0 ; i--) {
            for (int j = i+1; j <n ; j++) {
                //求dp[i][j]
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i+1][j]);
                }
            }
        }
        return dp[0][n-1];
    }
}
