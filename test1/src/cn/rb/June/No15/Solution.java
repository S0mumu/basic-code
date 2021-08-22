package cn.rb.June.No15;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> lists=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;
        for (int i = 0; i <len ; i++) {
            if(nums[i]>0)
                return lists;

            if(i>0 && nums[i]==nums[i-1])
                continue;

            int curr=nums[i];
            int L=i+1,R=len-1;
            while(L<R){
                int tmp=curr+nums[L]+nums[R];
                if(tmp==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(curr);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while(L<R && nums[L]==nums[L+1])
                        L++;
                    while(L<R && nums[R]==nums[R-1])
                        R--;
                    L++;
                    R--;
                }else if(tmp<0){
                    L++;
                }else{
                    R--;
                }
            }
        }
        return lists;
    }
}
