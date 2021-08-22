package cn.rb.Auguest.No11;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param grid int整型二维数组 为n*m 的二维数组
     * @return int整型
     */
    private int res = 0;
    private boolean[][] visited;
    private int[][] aa = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    public int getMaximumResource (int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    visited = new boolean[grid.length][grid[0].length];
                    help(grid,i,j,visited,0);
                }
            }
        }
        return res;
    }

    public void help(int[][] grid, int i, int j, boolean[][] visited, int val){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || visited[i][j] || grid[i][j]==0) return;
        visited[i][j] = true;
        int v = val+grid[i][j];
        if(res< v) res = v;
        for(int[] a:aa){
            help(grid,i+a[0],j+a[1],visited,v);
        }
        visited[i][j] = false;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.getMaximumResource(new int[][]{{0,6,0},{5,8,7},{0,9,0}}));
    }
}
