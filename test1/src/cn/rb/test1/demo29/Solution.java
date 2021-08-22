package cn.rb.test1.demo29;

public class Solution {
    /*
    public int search(int[] nums, int target) {
        //查找元素在数组中出现的次数
        int count=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==target)
                count++;
        }
        return count;
    }
*/
    public int search(int[] nums,int target){
        //统计一个元素在排序数组中出现的次数
        int i=0;
        int j=nums.length-1;
        //查找右边端点
        while(i<=j){
            int middle=(i+j)/2;
            if(middle<target){
                i=middle+1;
            }
            else if(middle>target){
                j=middle-1;
            }
            else{
                i=middle+1;
            }
        }
        int right=i;
        i=0;j=nums.length-1;
        //查找左边端点
        while(i<=j){
            int middle=(i+j)/2;
            if(middle<target){
                i=middle+1;
            }
            else if(middle>target){
                j=middle-1;
            }
            else{
                j=middle-1;
            }
        }
        int left=j;
        return right-left-1;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.search(new int[]{5,7,7,8,8,10},8));
    }
}
