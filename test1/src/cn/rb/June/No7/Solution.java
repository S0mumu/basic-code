package cn.rb.June.No7;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int minPathSum(int[][] grid){
        if(grid==null ||grid.length==0)
            return 0;
        for (int i = 1; i <grid.length ; i++) {
            grid[i][0]=grid[i-1][0]+grid[i][0];
        }
        for (int i = 1; i <grid[0].length ; i++) {
            grid[0][i]=grid[0][i-1]+grid[0][i];
        }
        for (int i = 1; i <grid.length ; i++) {
            for (int j = 1; j <grid[0].length ; j++) {
                if(grid[i-1][j]>grid[i][j-1]){
                    grid[i][j]=grid[i][j-1]+grid[i][j];
                }else{
                    grid[i][j]=grid[i-1][j]+grid[i][j];
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
