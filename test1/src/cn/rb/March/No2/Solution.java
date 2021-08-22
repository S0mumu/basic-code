package cn.rb.March.No2;

/**
 * @author ：rb
 * @version:
 * 剪绳子问题2 贪心算法
 */
public class Solution {
    public int cuttingRope(int n){
        if(n<=1)
            return -1;
        if(n==2)
            return 1;
        if(n==3)
            return 2;
        if(n==4)
            return 4;
        long res=1;
        while(n>4){
            //首先按3进行分割
            res*=3;
            res%=((int)(1e9+7));
            n-=3;
        }
        return (int) (res*n%1000000007);
    }

}
