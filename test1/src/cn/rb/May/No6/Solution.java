package cn.rb.May.No6;

import java.util.ArrayList;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    private ArrayList<String> res;
    private ArrayList<Character> mychar;
    char[] nums;
    public int translateNum(int num){
        String ss=num+"";
        nums=ss.toCharArray();
        res=new ArrayList<>();
        mychar= new ArrayList<>();
        search(0);
        return res.size();
    }
    public void search(int i){
        if(i>=nums.length){
            String s=mychar.toString();
            System.out.println(s);
            res.add(String.valueOf(mychar));
            i--;
            return ;
        }
        //两个位置搜索
        if(i+1<=nums.length-1 &&  Integer.parseInt(nums[i]+"")!=0 &&Integer.parseInt(""+nums[i]+nums[i+1])<=25) {
            mychar.add((char) (Integer.parseInt("" + nums[i] + nums[i + 1]) + 'a'));
            i = i + 2;
            search(i);
            i=i-2;
            mychar.remove(mychar.size()-1);
        }
        mychar.add((char)(Integer.parseInt(nums[i]+"")+'a'));
        i++;
        search(i);
        mychar.remove(mychar.size()-1);
        i--;



    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.translateNum(506));
        System.out.println(s.res);
    }
}
