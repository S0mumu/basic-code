package cn.rb.April.No22;

import com.sun.org.glassfish.gmbal.AMXMBeanInterface;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int maxFrequency(int[] nums,int k){
        for (int i = 0; i <k ; i++) {
            int[] temp=new int[nums.length];
            for (int j = 0; j <nums.length ; j++) {
                for (int l = 0; l <nums.length ; l++) {
                    if(nums[l]-nums[j]>0 ){
                        if(temp[j]==0){
                            temp[j]=nums[l] - nums[j];
                        }else {
                            temp[j] = Math.min(temp[j], nums[l] - nums[j]);
                        }
                    }

                }
            }

            //得到了最小的差值
            int index=0;
            int minValue=Integer.MAX_VALUE;
            for (int j = 0; j <temp.length ; j++) {
                if(temp[j]!=0 && minValue>temp[j]){
                    minValue=temp[j];
                    index=j;
                }
            }

            nums[index]++;

        }


        Integer[] res=new Integer[nums.length];
        for (int i = 0; i <res.length ; i++) {
            res[i]=0;
        }


        for (int i = 0; i <nums.length ; i++) {
            int temp=nums[i];
            for (int j=0;j<nums.length;j++){
                if(temp==nums[j]){
                    res[i]++;
                }
            }

        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(res,(o1,o2) ->((o1==o2)?0:(o1>o2?-1:1)));//lambda表达式写法
        System.out.println(Arrays.toString(res));
        return res[0];
    }

    public static void main(String[] args) {
        
        Solution s=new Solution();
        System.out.println(s.maxFrequency(new int[]{3,9,6},3));
    }
}
