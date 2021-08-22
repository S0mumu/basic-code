package cn.rb.June.No16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        if(nums==null)
            return null;
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for (int i = 0; i <=nums.length-3 ; i++) {
            int j=i+1;
            int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while (j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else{
                    k--;
                }

            }
        }
        return  result;
    }
}
