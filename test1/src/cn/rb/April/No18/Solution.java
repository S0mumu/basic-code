package cn.rb.April.No18;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int maxSumSubmatrix(int[][] matrix,int k){
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] hh=new int[row+1][col+1];


        //存储从（0，0）位置开始的前缀和
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                hh[i][j]=hh[i-1][j]+hh[i][j-1]-hh[i-1][j-1]+matrix[i-1][j-1];
            }
        }
        int val=Integer.MIN_VALUE;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {

                //从（i，j）位置开始的下标

                for (int l = i+1; l <=row ; l++) {
                    for (int m = j+1; m <=col ; m++) {
                        int temp=hh[l][m]+hh[i][j]-hh[i][m]-hh[l][j];
                        if(temp<=k){
                            val=Math.max(val,temp);
                        }
                    }
                }
            }
        }

        return val;
    }
}
