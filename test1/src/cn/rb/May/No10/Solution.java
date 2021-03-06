package cn.rb.May.No10;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int singleNumber(int[] nums){

        int[] counts=new int[32];//用于存储32位数据
        for (int num:nums) {
            for (int i = 0; i <32 ; i++) {
               counts[i]+= num&1;
               num>>>=1;
            }
        }

        int res=0,m=3;
        for (int i = 0; i <32 ; i++) {
            res<<=1;
            res=counts[31-i]%m | res;


        }
        return res;
    }
}
