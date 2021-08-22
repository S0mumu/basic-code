package cn.rb.June.No3;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public void rotate(int[][] matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <i ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int j = 0; j <matrix.length/2 ; j++) {
            for (int i = 0; i <matrix.length ; i++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j]=temp;
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    public static void main(String[] args) {
        Solution s=new Solution();
//        s.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        s.rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }
}
