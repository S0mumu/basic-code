package cn.rb.April.No3;

import static java.lang.Math.min;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    int i[][];
    public int nthUglyNumber(int n) {
        System.out.println(i);
        int[] arr=new int[n];
        arr[0]=1;
        int dp1=0,dp2=0,dp3=0;
        for(int i=1;i<n;i++){
            arr[i]= min(min(arr[dp1]*2,arr[dp2]*3),arr[dp3]*5);
            if(arr[i]==arr[dp1]*2){
                dp1++;
            }else if(arr[i]==arr[dp2]*3){
                dp2++;
            }else{
                dp3++;
            }
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.nthUglyNumber(9);
    }
}
