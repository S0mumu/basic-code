package cn.rb.Auguest.No2;

/**
 * @author ：rb
 * @version:
 */
public class Solution {

    public int minFallingPathSum(int[][] matrix){
        if(matrix==null ||matrix.length==0 ||matrix[0].length==0) {
            return 0;
        }
        int[][] dp=new int[matrix.length][matrix[0].length];
        for (int i = 0; i <matrix[0].length ; i++) {
            dp[0][i]=matrix[0][i];
        }
        for (int i = 1; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                int min=dp[i-1][j];
                if(j-1>=0){
                    min=Math.min(min,dp[i-1][j-1]);
                }
                if(j+1<matrix[0].length){
                    min=Math.min(min,dp[i-1][j+1]);
                }
                System.out.println(min);
                dp[i][j]=min+matrix[i][j];
            }
        }
        int res=dp[dp.length-1][0];
        for (int i = 1; i <dp[dp.length-1].length ; i++) {
            res=Math.min(res,dp[dp.length-1][i]);
        }
        return  res;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.minFallingPathSum(new int[][]{{10,-98,44},{-20,65,34},{-100,-1,74}}));
    }
}
