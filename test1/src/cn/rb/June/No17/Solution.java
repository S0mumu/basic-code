package cn.rb.June.No17;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int temp=nums[0]+nums[1]+nums[nums.length-1];
        for (int i = 0; i <=nums.length-3 ; i++) {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int cur=nums[i]+nums[j]+nums[k];
                if(cur==target){
                    return cur;
                }
                if(Math.abs(temp-target)>Math.abs(cur-target)){
                    temp=cur;
                }
                if (cur>target){
                    k--;
                    while (j<(k-1) && nums[k-1]==nums[k]){
                        k--;
                    }
                }
                if(cur<target){
                    j++;
                    while (j+1<k && nums[j+1]==nums[k]){
                        j++;
                    }
                }
            }
        }
        return temp;
    }
}
