package cn.rb.March.No3;

/**
 * @author ：rb
 * @version：剪绳子 贪心 快速幂
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
        int a=n/3;  //快速幂的幂次
        int b=n%3;
        if(b==0)
            return (int) quickmi(3,a,1000000007);
        else if(b==1)
            return (int) (quickmi(3,a-1,1000000007)*4%1000000007);
        else
            return (int)(quickmi(3,a,1000000007)*2%1000000007);

    }
    public long quickmi(int b, int a, int yu){
        long base = b % yu;
        long res= 1;
        while(a !=0){
            if((a&1)!=0){//b化为2进制，最后一位不为0
                res=(base*res)%yu;
            }
            base=((base% yu)*(base% yu))%yu;
            a>>=1;
        }
        return res;
    }
    public long fastPower(int a, int b, int n) {
        if (n == 0) {
            return 1 % b;
        }
        long ans = 1l;
        long base = a % b;
        while (n != 0) {
            if ((n & 1) == 1) {
                ans = (ans * base) % b;
            }
            //为了避免超出long的范围，所以取三次模
            base = (base % b) * (base % b) % b;
            n >>= 1;
        }
        return ans;
    }
}
