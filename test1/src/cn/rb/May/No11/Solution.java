package cn.rb.May.No11;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int maxProfit(int[] prices){
        if(prices==null || prices.length==0)
            return 0;
        int max=prices[0];
        int min=prices[0];
        int count=max-min;
        for (int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                max=prices[i];
            }else if(prices[i]>max){
                max=prices[i];
               if(count<=max-min){
                   count=max-min;
               }
            }
        }
        return  count;
    }
}
