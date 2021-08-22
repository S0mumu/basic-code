package cn.rb.May.No5;

import java.util.Map;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int findNthDigit(int n){
        int digit=1;
        long count=9;
        long start=1;
        //确定digit
        while(n>count){
            n-=count;
            start=start*10;
            digit++;
            count=digit*9*start;

        }
        long num=start+(n-1)/digit;
        return Long.toString(num).charAt((n-1)%digit)-'0';
    }
}
