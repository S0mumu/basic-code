package cn.rb.May.No24;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public void nextPermutation(int[] nums){
        if (nums==null ||nums.length<=1){

        }else {
            int target = nums.length - 1; //确定最小值
            for (int i = nums.length - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    target=i;
                    break;
                }

            }
            if (target != nums.length - 1) {
                //整个数组不是逆序
                int j = nums.length - 1;
                for (; j > target; j--) {
                    if (nums[j] > nums[target]) {
                        break;
                    }
                }
                if(j==nums.length-1 && nums[j]<nums[target]){
                    int temp=nums[target];
                    nums[target]=nums[target-1];
                    nums[target-1]=temp;
                    target--;
                }else {
                    int temp = nums[target];
                    nums[target] = nums[j];
                    nums[j] = temp;
                }
                for (int k = 1; k <= (nums.length - target) / 2; k++) {
                    int temp = nums[target + k];
                    nums[target + k] = nums[nums.length - k];
                    nums[nums.length - k] = temp;
                }
            } else {
                for (int k = 0; k < nums.length / 2; k++) {
                    int temp = nums[k];
                    nums[k] = nums[nums.length - 1 - k];
                    nums[nums.length - 1 - k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.nextPermutation(new int[]{1,3,2});
    }

}
