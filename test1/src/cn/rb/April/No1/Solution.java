package cn.rb.April.No1;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int trap(int[] height){
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        left[0]=height[0];
        for (int i=1;i<height.length;i++){
            if(left[i-1]>height[i])
                left[i]=left[i-1];
            else{
                left[i]=height[i];
            }
        }
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            if(right[i+1]>height[i])
                right[i]=right[i-1];
            else
                right[i]=height[i];
        }

        for(int i=0;i<height.length;i++){
            left[i]=left[i]<right[i]?left[i]:right[i];
        }
        int total=0;
        for(int i=0;i<height.length;i++){
            total+=left[i]-height[i];
        }
        return total;
    }
}
