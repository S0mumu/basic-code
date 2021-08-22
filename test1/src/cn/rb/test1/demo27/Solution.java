package cn.rb.test1.demo27;

public class Solution {
    public int maxSubString(int[] nums){
        if(nums==null||nums.length==0)
            return -1;
        int max=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i-1]>0)
                nums[i]=nums[i]+nums[i-1];
            if(max<nums[i])
                max=nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.maxSubString(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
