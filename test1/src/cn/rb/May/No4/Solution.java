package cn.rb.May.No4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    List<String> res=new ArrayList<>();
    char[] chars;
    public String[] permutation(String s){
        chars=s.toCharArray();
        dfs(0);//从index0开始遍历
        return res.toArray(new String[res.size()]);
    }
    public void dfs(int x){

        if(x==chars.length-1){
            //只剩下最后一个位置
            res.add(String.valueOf(chars));
            return;
        }
        //遍历x位置
        HashSet<Character> myHashSet=new HashSet<>();//每个x位置都用一个hashset来存储出现过的元素

        //循环x位置可能的值,x位置前的元素都已经确定
        for (int i = x; i <chars.length ; i++) {
            //确定i位置的元素与x位置的元素进行交换
            if(!myHashSet.contains(chars[i])){
                myHashSet.add(chars[i]);
                swap(i,x);
                dfs(x+1);
                swap(x,i);
            }

        }

    }
    public void swap(int a,int b){
        char temp=chars[a];
        chars[a]=chars[b];
        chars[b]=temp;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s);
    }
}
