package cn.rb.Auguest.No7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public static void main(String[] args) {
        //动态规划
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int max=Math.max(n,m);
        int[] dp=new int[2*max+1];

        for (int i = 0; i <dp.length ; i++) {
            if(i<=5){
                dp[i]=5-i;
            }else {
                dp[i] = i-5;
            }
        }
        for(int i=1; i<2*max+1;i++){
            if(i*2<(2*max+1) && dp[i*2]>(dp[i]+1)) {
                dp[i*2] = dp[i] + 1;
            }
            if(i+1<(2*max+1) && dp[i+1]>(dp[i]+1)){
                dp[i+1] = dp[i] + 1;
            }
            if(i-1>=0 && dp[i-1]>(dp[i]+1)){
                dp[i-1] = dp[i] + 1;
            }
        }
       // System.out.println(Arrays.toString(dp));
        System.out.println(dp[m]);

    }
}
