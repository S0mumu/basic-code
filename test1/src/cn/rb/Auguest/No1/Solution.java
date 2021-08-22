package cn.rb.Auguest.No1;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int coinChange(int[] coins,int amount){
        int max=amount+1;
        int[] dp=new int[amount+1];
        Arrays.fill(dp,max);
        dp[0]=0;
        for (int i = 1; i <=amount ; i++) {
            for (int j = 0; j <coins.length ; j++) {
                if(i>=coins[j]){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]==max?-1:dp[amount];

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.coinChange(new int[]{2},4));
    }
}
