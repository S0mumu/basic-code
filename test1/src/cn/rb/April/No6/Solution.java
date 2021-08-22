package cn.rb.April.No6;

/**
 * @author ：rb
 * @version:
 * 二分法查找排序数组中的最小值
 */
public class Solution {
    public int findMin(int[] nums){
        int i=0,j=nums.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(nums[mid]<nums[j]){
                j=mid;
            }else if(nums[mid]>nums[j]){
                i=mid;
            }else{
                j--;
            }
        }
        return nums[i];
    }
}
