package cn.rb.March.No1;

import java.math.BigInteger;

/**
 * @author ：rb
 * 剪绳子问题
 *  把n长的绳子剪成m段，计算这m段绳子的可能的最大乘积
 *  动态规划问题
 * @version:
 */
public class Solution {
    public int cuttingRope(int n){
        if(n<=0)
            return -1;
        BigInteger[] dp=new BigInteger[n+1];//存储i长度的绳子剪后得到的最大乘积
        dp[0]= BigInteger.valueOf(0);
        dp[1]= BigInteger.valueOf(0);
        for (int i = 2; i <n+1 ; i++) {
            dp[i]= BigInteger.valueOf(0);
            for (int j = 1; j <i ; j++) {
                BigInteger temp;
                if(-1 == (dp[i-j].compareTo(BigInteger.valueOf(i-j)))){
                    temp=BigInteger.valueOf(j*(i-j));
                }else{
                    temp=dp[i-j].multiply(BigInteger.valueOf(j));
                }
                if(temp.compareTo(dp[i])==1)
                    dp[i]=temp;
            }

        }
        return dp[n].mod(BigInteger.valueOf(1000000007)).intValue();
    }
}
