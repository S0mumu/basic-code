package cn.rb.test1.demo38;

public class Solution {
    public String reverseLeftWords(String s, int n) {
        String r1=s.substring(n);
        String r2=s.substring(0,n);
        return r1+r2;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.reverseLeftWords("lrloseumgh",6));
    }
}
