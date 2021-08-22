package cn.rb.test1.demo37;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String reverseWords(String s){
        s=s.trim();
        int i,j;
        i=j=s.length()-1;
        StringBuilder res=new StringBuilder();
        while(i>=0){
            //首先搜索第一个单词后的空格
            while(i>=0&&s.charAt(i)!=' ')
                i--;
            res.append(s.substring(i+1,j+1)+" ");
            while(i>=0&&s.charAt(i)==' ')
                i--;
            j=i;
        }
        return res.toString().trim();

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.reverseWords("the sky is blue"));
    }
}
