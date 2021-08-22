package cn.rb.duozhayu;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution4 {
    private static int[][] list;
    private static int[][] visted;
    private static int[][] direction;
    private static int k=1;
    private static int num;
    private static int d;
    public int[] numberOfShelves (int N) {
        num=N;
        list=new int[num][num];
        int[] res=new int[(num*num-num)/2+num];
        visted=new int[num][num];
        direction=new int[][]{{1,0},{-1,1},{0,-1}};
        d=0;
        search(0,0);
        int temp=0;
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N-i ; j++) {
                res[temp]=list[i][j];
                temp++;
            }
        }
        return res;
    }
    public void search(int i,int j){
        if(i<0 || i>=num || j<0 || j>=num-i || visted[i][j]==1 ){
            return ;
        }
        list[i][j]=k;
        visted[i][j]=1;
        k++;
        for (int l = 0; l <direction.length ; l++) {

            search(i+direction[d][0],j+direction[d][1]);
            d=(d+1)%3;
        }

    }

    public static void main(String[] args) {
        Solution4 solution4=new Solution4();
        System.out.println(Arrays.toString(solution4.numberOfShelves(5)));
    }
}
