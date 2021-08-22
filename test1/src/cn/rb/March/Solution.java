package cn.rb.March;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int climbStairs(int n){
        if(n<=2){
            return n;
        }
        int[] counts=new int[n+1];
        counts[0]=0;
        counts[1]=1;
        counts[2]=2;
        for (int i = 3; i <=n ; i++) {
            counts[i]=counts[i-1]+counts[i-2];

        }
        return counts[n];
    }
}
