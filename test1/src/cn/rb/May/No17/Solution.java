package cn.rb.May.No17;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int maxProfit(int[] prices){
        if(prices==null||prices.length==0)
            return 0;
        int cur_s=prices[0],cur_e=prices[0];
        int max=0;
        for (int i = 1; i <prices.length ; i++) {
            if(cur_s>prices[i]){
                cur_s=prices[i];
                cur_e=prices[i];
                if(max<cur_e-cur_s)
                    max=cur_e-cur_s;
            }else if(cur_e<prices[i]){
                cur_e=prices[i];
            }
        }
        if(max<cur_e-cur_s)
            max=cur_e-cur_s;
        return max;

    }
}
