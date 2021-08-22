package cn.rb.test1.demo13;

public class Solution {
    /*
    public int hammingWeight(int n) {
        int result=0;
        while(n!=0){
            result+=n&1;
            n>>>=1;
        }
        return result;

    }
    */

    public int hammingWeight(int n){
        int result=0;
        while(n!=0){
            result++;
            n=n&(n-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(00101&1);
       // System.out.println(s.hammingWeight(00000000000000000000000000001011));
    }
}
