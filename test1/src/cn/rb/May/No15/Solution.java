package cn.rb.May.No15;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    int  count;
    int[] temp;
    public int reversePairs(int[] nums){
       if(nums==null ||nums.length<2)
            return 0;
       temp=new int[nums.length];
       sort(nums,0,nums.length-1);
       return count;
    }

    public void sort(int[] nums,int i,int j){
        if(i>=j){
            return ;
        }
        int middle=(i+j)/2;
        sort(nums,i,middle);
        sort(nums,middle+1,j);
        int temp_1=i;
        int temp_2=middle+1;

        //合并阶段
        for (int k = i; k <=j ; k++) {
            temp[k]=nums[k];
        }
        int k=i;
        while(temp_1<=middle && temp_2<=j){

            if(temp[temp_1]>temp[temp_2]){
                count+=middle-temp_1+1;
                System.out.println(middle-temp_1+1);
                nums[k++]=temp[temp_2++];
            }else{
                nums[k++]=temp[temp_1++];
            }
        }
        while(temp_1<=middle){
            nums[k++]=temp[temp_1++];
        }
        while(temp_2<=middle){
            nums[k++]=temp[temp_2++];
        }


    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.reversePairs(new int[]{4,5,6,7}));
    }
}
