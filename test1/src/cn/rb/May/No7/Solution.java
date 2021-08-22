package cn.rb.May.No7;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int maxValue(int[][] grid){
        if(grid==null || grid.length==0 || grid[0].length==0)
            return -1;
        int[][] dp=new int[grid.length][grid[0].length];
        int m=grid.length;
        int n=grid[0].length;
        dp[0][0]=grid[0][0];
        for (int i = 1; i <m ; i++) {
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for (int j = 1; j <n ; j++) {
            dp[0][j]=dp[0][j-1]+grid[0][j];
        }
        int cur_i=1;
        int cur_j=1;
        while(!(cur_i>=m && cur_j>=n)){
            for (int i = cur_i; i <m ; i++) {
                if(dp[i-1][cur_j]>dp[i][cur_j-1])
                    dp[i][cur_j]=dp[i-1][cur_j]+grid[i][cur_j];
                else
                    dp[i][cur_j]=dp[i][cur_j-1]+grid[i][cur_j];
            }
            for (int j = cur_j+1; j <n ; j++) {
                if(dp[cur_i-1][j]>dp[cur_i][j-1])
                    dp[cur_i][j]=dp[cur_i-1][j]+grid[cur_i][j];
                else
                    dp[cur_i][j]=dp[cur_i][j-1]+grid[cur_i][j];
            }
            cur_i++;
            cur_j++;
        }
        return dp[m-1][n-1];
    }
}
