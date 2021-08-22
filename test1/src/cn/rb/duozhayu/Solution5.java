package cn.rb.duozhayu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ：rb
 * @version:
 */
public class Solution5 {
    private static int[][] visited;
    private static int[][] list;
    private static int size;
    private static HashMap<Integer,Integer> map;
    public int categoryOfMaxWarehouseArea (int[][] grid) {
        list=grid;
        visited=new int[grid.length][grid[0].length];
        map=new HashMap<>();
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[0].length ; j++) {
                if(visited[i][j]==0){
                    size=0;
                    search(i,j,grid[i][j]);
                }
            }
        }
        int max=0;
        int index=0;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> e:entries) {
            if(e.getValue()>max){
                index=e.getKey();
                max=e.getValue();
            }
        }
        return index;
    }
    public void search(int i,int j,int target){
        if(i<0 || i>=list.length || j<0 || j>=list[0].length || visited[i][j]==1
                || list[i][j]!=target){
            return ;
        }
        size++;
        visited[i][j]=1;
        search(i+1,j,target);
        search(i-1,j,target);
        search(i,j+1,target);
        search(i,j-1,target);
        if(!map.containsKey(list[i][j]) || map.get(list[i][j])<size){
            map.put(list[i][j],size);
        }

    }

    public static void main(String[] args) {
        Solution5 solution5=new Solution5();
        solution5.categoryOfMaxWarehouseArea(new int[][]{
                {1,1,1,2},{2,1,2,2},{3,2,3,3}
        });
    }
}
