package cn.rb.May.No19;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int maxArea(int[] height){
        if(height==null || height.length==0)
            return 0;
        int i=0,j=height.length-1;
        int res=0;
        while(i<j){
            int temp=(j-i)*Math.min(height[i],height[j]);
            if(temp>res)
                res=temp;
            if(Math.min(height[i],height[j])==height[i])
                i++;
            else
                j--;
        }
        return res;
    }
}
