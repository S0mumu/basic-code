package cn.rb.test1.demo22;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public int[] spiralOrder(int[][] matrix) {
        /*
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return new int[0];
        int a = matrix.length;
        int b = matrix[0].length;
        int totalelems = a * b;
        int i = 0;
        int j = 0;
        int[][] visited = new int[a][b];
        visited[i][j] = 1;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int current = 0;
        int[] myresult = new int[totalelems];
        myresult[0] = matrix[i][j];
        int directionindex = 0;
        while (current < totalelems - 1) {

            int newi = i + directions[directionindex][0];
            int newj = j + directions[directionindex][1];
            if (newi >= a || newi < 0 || newj >= b || newj < 0 || visited[newi][newj] != 0) {
                directionindex = (directionindex + 1) % 4;
            }
            i += directions[directionindex][0];
            j += directions[directionindex][1];
            visited[i][j] = 1;
            current++;
            myresult[current] = matrix[i][j];

        }
        return myresult;

        */

        if(matrix==null ||matrix.length==0||matrix[0].length==0)
            return new int[0];
        int rows=matrix.length;int columns=matrix[0].length;
        int left=0,right=columns-1,top=0,bottom=rows-1;
        int[] myresult=new int[rows*columns];
        int current=0;
        while(left<=right &&top<=bottom){
            for (int i = left; i <=right ; i++) {
                myresult[current++]=matrix[top][i];
            }
            for (int i = top+1; i <=bottom ; i++) {
                myresult[current++]=matrix[i][right];
            }
            if(left<right && top<bottom){
                for (int i = right-1; i >=left ; i--) {
                    myresult[current++]=matrix[bottom][i];
                }
                for (int i = bottom-1; i >=top+1 ; i--) {
                    myresult[current++]=matrix[i][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return myresult;
    }




}
