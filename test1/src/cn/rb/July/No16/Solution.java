package cn.rb.July.No16;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int getSize(long n){
        int count=0;
        while (n>0){
            count++;
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.getSize(6));
    }
}
