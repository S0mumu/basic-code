package cn.rb.May.No14;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int strToInt(String str){
        if(str==null||str.length()==0)
            return 0;
        char[] chars = str.trim().toCharArray();
        if(chars.length==0)
            return 0;
        int flag=0;//表示正数
        long res=0;
        for (int i = 0; i <chars.length ; i++) {
            if(i==0 && chars[i]=='-') {
                flag = 1;
            }
            else if(i==0 && chars[i]=='+') {
                flag = 0;
            }else{
                if(chars[i]>='0' && chars[i]<='9')
                    res=res*10+chars[i]-'0';
                else{
                    break;
                }
            }
            if(flag==0 && res>=Integer.MAX_VALUE){
                res=Integer.MAX_VALUE;
                break;
            }else if(flag==1 && -res<=Integer.MIN_VALUE){
                res=Integer.MIN_VALUE;
                break;
            }
        }
        if(flag==1)
            res=-res;
        return (int)res;
    }
}
