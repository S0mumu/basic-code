package cn.rb.test1.demo41;

public class Solution {
    public boolean isStraight(int[] nums){
        int[] myarray=new int[14];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<0 || nums[i]>13)
                return false;
            myarray[nums[i]]++;
        }
        int min=14;
        int max=0;
        for (int i = 1; i <14 ; i++) {
            if(myarray[i]!=1&&myarray[i]!=0)
                return false;
            if(myarray[i]==1){
                if(i<min)
                    min=i;
                if(i>max)
                    max=i;
            }

        }

        if(min!=14 && max !=0 && max-min<=4)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.isStraight(new int[]{1,2,3,4,5}));
    }
}
