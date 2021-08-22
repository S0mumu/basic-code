package cn.rb.June.No19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix){
        if(matrix==null|| matrix.length==0||matrix[0].length==0)
            return new ArrayList<>();
        int[][] visited=new int[matrix.length][matrix[0].length];
        int i=0;
        int j=0;
        visited[i][j]=1;
        List<Integer> mylist=new ArrayList<>();
        mylist.add(matrix[i][j]);
        int count=1;
        int[][] indexes={{0,1},{1,0},{0,-1},{-1,0}};
        int idx=0;
        while(count<=matrix.length*matrix[0].length){
            for (int k = 0; k <4 ; k++) {
                int cur_indexes=(idx+k)%4;
                int cur_i=i+indexes[cur_indexes][0];
                int cur_j=j+indexes[cur_indexes][1];
                if(cur_i>=0&&cur_i<matrix.length && cur_j>=0 && cur_j<matrix[0].length && visited[cur_i][cur_j]==0){
                    i=cur_i;
                    j=cur_j;
                    visited[i][j]=1;
                    idx=cur_indexes;
                    mylist.add(matrix[i][j]);
                    break;

                }
            }
            count++;
        }
        return  mylist;
    }
}
