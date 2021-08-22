package cn.rb.April.No20;

import java.util.ArrayList;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public String minNumber(int[] nums){
        //快速排序
        String[] string_nums=new String[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            string_nums[i] = nums[i] + "";
        }
        sortString(string_nums,0,nums.length-1);
        String res="";
        for (int i = 0; i <string_nums.length ; i++) {
            res+=string_nums[i];
        }
        return res;
    }

    public void sortString(String[] string_nums,int i,int j){
        int start=i;
        int end=j;
        if(i>=j)
            return;
        int cur_index=i;
        String temp=string_nums[i];
        i++;
        while(i<=j){
            while(i<=j && Double.parseDouble(string_nums[j]+temp)>Double.parseDouble(temp+string_nums[j])){
                j--;

            }
            if(i<=j){
                string_nums[cur_index]=string_nums[j];
                cur_index=j;
                j--;
            }


            while(i<=j && Double.parseDouble(string_nums[i]+temp)<Double.parseDouble(temp+string_nums[i])){
                i++;

            }
            if(i<=j) {
                string_nums[cur_index] =string_nums[i];
                cur_index=i;
                i++;
            }

        }
        string_nums[cur_index]=temp;

        sortString(string_nums,start,cur_index-1);
        sortString(string_nums,cur_index+1,end);
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.minNumber(new int[]{1,2,3,1});
    }

}
