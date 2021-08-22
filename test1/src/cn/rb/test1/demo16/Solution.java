package cn.rb.test1.demo16;

import java.util.Arrays;

public class Solution {
    public int[] exchange(int[] nums){
        int j=nums.length-1;
        int i=0;
        while(i<j){
            if(nums[i]%2==0 && nums[j]%2==1){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }else if(nums[i]%2==1){
                i++;
            }else if(nums[j]%2==0){
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(Arrays.toString(s.exchange(new int[]{1,2,3,4,4})));
    }
}
