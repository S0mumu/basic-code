package cn.rb.April.No21;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int sumBase(int n,int k){
        int res=0;
        int count=0;
        while(n/Math.pow(k,count)>=k){
            count++;
        }
        while(count>=0){
            int temp=(int) (n/Math.pow(k,count));
            n= (int) (n-temp*Math.pow(k,count));
            res+=temp;
            count--;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println( s.sumBase(34,6));
    }
}
