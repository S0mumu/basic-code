package cn.rb.June.No8;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public void sortColors(int[] nums){
        int i=0,j=0;
        for (int k = 0; k <nums.length ; k++) {
            if(nums[k]==1){
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                j++;
            }
            if(nums[k]==0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                if(nums[k]<=nums[j]){
                    temp=nums[k];
                    nums[k]=nums[j];
                    nums[j]=temp;
                }
                i++;
                j++;
            }
        }
    }
}

