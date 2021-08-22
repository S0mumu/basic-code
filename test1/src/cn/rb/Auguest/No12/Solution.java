package cn.rb.Auguest.No12;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int index=0;
        for (int i = 0; i <words.length ; i++) {
            for (int j = 0; j <words[i].length() ; j++) {
                if(index>=s.length()||s.charAt(index)!=words[i].charAt(j)){
                    return false;
                }
                index++;
            }
            if(index==s.length()){
                return true;
            }
        }
        if(s.length()>index){
            return false;
        }else{
            return true;
        }

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.isPrefixString("iloveleetcodeff",new String[]{"i","love","leetcode"}));
    }
}
