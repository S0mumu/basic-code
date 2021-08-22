package cn.rb.June.No1;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int[] searchRange(int[] nums,int target){
        if(nums==null || nums.length==0)
            return new int[]{-1,-1};
        int i=0;
        int j=nums.length-1;
        int[] result=new int[]{-1,-1};
        while(i<=j){
            int middle=(i+j)/2;
            if(nums[middle]<target){
                i=middle+1;
            }else if(nums[middle] >target){
                j=middle-1;
            }else{
                if(nums[i]==target && nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }else if(nums[i]==target){
                    j--;
                }else if(nums[j]==target){
                    i++;
                }else{
                    i++;
                    j--;
                }
            }
        }
        //System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.searchRange(new int[]{},0);
    }
}
