package cn.rb.test1.demo30;

public class Solution {
    public int missingNumber(int[] nums){
        int i=0;//i 指向右数组的首位元素
        int j=nums.length-1;//j 指向的是左数组的最后一个元素
        while(i<=j){//当i与j没有中间元素是，则输出i就是索取的元素
            int middle=(i+j)/2;
            if(middle==nums[middle]){
                //说明空缺的元素在middle的右边
                //i一定大于middle
                i=middle+1;
            }
            else{
                //说明空缺的元素在middle的左边
                //j一定小于middle
                j=middle-1;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.missingNumber(new int[]{0}));
    }
}
