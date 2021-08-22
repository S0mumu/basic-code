package cn.rb.duozhayu;

/**
 * @author ：rb
 * @version:
 */
public class Solution2 {
    public int purchase(int[] nums,int budget){
        int res=0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i; j <nums.length ; j++) {
                if(nums[i]+nums[j]<budget){
                    res++;
                }
            }
        }
        return res;
    }
}
