package cn.rb.June.No13;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int myAtoi(String s){
        s=s.trim();
        int flag=1;
        if(s.charAt(0)=='+'){
            flag=1;
            s=s.substring(1);
        }else if(s.charAt(0)=='-'){
            flag=-1;
            s=s.substring(1);
        }
        long temp=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)<'0' || s.charAt(i)>'9'){
                break;
            }
            temp=temp*10+s.charAt(i)-'0';
            if(flag==-1 && temp>=(long)Integer.MAX_VALUE+1){
                return Integer.MIN_VALUE;
            }
            if(flag==1 && temp>=(long)Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
        }
        return (int)temp*flag;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.myAtoi("   -42");
    }
}
