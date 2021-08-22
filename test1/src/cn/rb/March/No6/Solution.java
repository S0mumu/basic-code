package cn.rb.March.No6;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public double myPow(double x,int n){

        if(x==0)
            return 0;
        if(n==0)
            return 1;
        long b=n;
        if(b<0)
        {
            x=1.0/x;
            b=-b;
        }
        double res=1.0;
       //使用快速幂算法
        while(b!=0){
            if((b & 1) == 1){
                res*=x;

            }
            x*=x;
            b>>=1;
        }
        return res;
    }


    public static void main(String[] args) {
        Solution s=new Solution();
        s.myPow(0,0);
    }
}
