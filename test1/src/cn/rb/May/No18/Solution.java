package cn.rb.May.No18;

import java.util.Stack;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public String longestPalindrome(String s){
        if(s==null ||s.length()==0)
            return "";

        int len=0;
        int start=0;
        int end=0;
        for (int i = 0; i <s.length() ; i++) {
            System.out.println("i="+i);
            int len1=expandAroundCenter(s,i,i);
            int len2=expandAroundCenter(s,i,i+1);
            if(len<Math.max(len1,len2)){
                len=Math.max(len1,len2);
                start=i-(len-1)/2;
                end=i+(len)/2;
            }
            System.out.println(len);
        }
        System.out.println("start="+start);
        System.out.println("end="+end);
        return s.substring(start,end+1);
    }

    public int expandAroundCenter(String s,int left,int right){
        while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.longestPalindrome("babad"));
    }

}
