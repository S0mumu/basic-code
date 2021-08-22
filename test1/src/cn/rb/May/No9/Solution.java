package cn.rb.May.No9;

import java.util.HashMap;

/**
 * @author ：rb
 * @version:
 */

public class Solution {
    public int[] singleNumbers(int[] nums){
        int res=0;
        for (int i:nums) {
            res^=i;
        }
        int div=1;
        while((div & res)==0){
            div<<=1;
        }
        int a=0,b=0;
        for (int i:nums) {
            if((div & i)==0){
                a^=i;
            }else{
                b^=i;
            }
        }

        return new int[]{a,b};

    }
}
