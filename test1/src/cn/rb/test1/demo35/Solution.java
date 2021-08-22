package cn.rb.test1.demo35;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;int j=nums.length-1;
        while(i<j){
            if(nums[j]+nums[i]<target){
                i++;
            }else if(nums[j]+nums[i]>target){
                j--;
            }else{
                return new int[]{i,j};
            }
        }
        return null;
    }

}
