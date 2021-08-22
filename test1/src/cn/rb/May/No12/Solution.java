package cn.rb.May.No12;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    int res=0;
    public int sumNums(int n){
        boolean hh= n>0 && sumNums(n-1)>0;
        res+=n;
        return res;
    }
}
