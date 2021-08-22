package cn.rb.June.No20;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int[][] generateMatrix(int n){
        int[][] result=new int[n][n];
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        int cur_dir=0;
        int i=0;
        int j=0;
        result[i][j]=1;
        for (int k = 2; k <=n*n ; k++) {
            for (int l = 0; l <4 ; l++) {
                int temp_dir=(cur_dir+l)%4;
                int cur_i=dir[temp_dir][0]+i;
                int cur_j=dir[temp_dir][1]+j;
                if (cur_i>=0 && cur_i<n && cur_j>=0 && cur_j<n
                        && result[cur_i][cur_j]==0){
                    result[cur_i][cur_j]=k;
                    cur_dir=temp_dir;
                    i=cur_i;
                    j=cur_j;
                    break;
                }

            }
        }
        return result;
    }
}
