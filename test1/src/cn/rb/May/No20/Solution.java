package cn.rb.May.No20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        if(nums==null || nums.length==0)
            return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            if(i-1>=0 && nums[i]==nums[i-1])
                continue;
            int j=i+1;
            int k=nums.length-1;
            int cur=-nums[i];
            while(j<k){
                if(nums[j]+nums[k]<cur){
                    j++;
                }else if(nums[j]+nums[k]>cur){
                    k--;
                }else{
                    if(j-1>i && nums[j]==nums[j-1]){
                        j++;
                    }else if(k+1<nums.length &&nums[k]==nums[k+1]){
                        k--;
                    }else{
                        List<Integer> hh=new ArrayList<>();
                        hh.add(nums[i]);
                        hh.add(nums[j]);
                        hh.add(nums[k]);
                        res.add(hh);
                        System.out.println(hh.toString());
                        j++;
                        k--;
                    }
                }
            }
        }
        return res;
    }
}
