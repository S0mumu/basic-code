package cn.rb.Auguest.No6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    static int temp_mianji=0;
    static int max_mianji=0;
    static int[][] list=null;
    static int[][] visited=null;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int l=sc.nextInt();
        list=new int[w][l];
        visited=new int[w][l];
        for (int i = 0; i <w ; i++) {
            for (int j = 0; j <l ; j++) {
                list[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <w ; i++) {
            for(int j=0;j<l;j++){
                if(list[i][j]!=0 && visited[i][j]==0){
                    temp_mianji=0;
                    search(i,j);
                    if(temp_mianji>max_mianji){
                        max_mianji=temp_mianji;
                    }
                }
            }
        }
        System.out.println(max_mianji);
    }
    public static void search(int i,int j){
        if(!(i>=0 && i<=list.length-1 && j>=0 && j<=list.length-1)){
            return ;
        }
        if(visited[i][j]==0 && list[i][j]!=0){
            temp_mianji+=list[i][j];
            visited[i][j]=1;
            search(i-1,j);
            search(i+1,j);
            search(i,j-1);
            search(i,j+1);
        }
    }
}
