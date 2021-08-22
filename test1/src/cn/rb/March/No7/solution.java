package cn.rb.March.No7;

import java.lang.reflect.Array;

/**
 * @author ：rb
 * @version:
 */
public class solution {
    public boolean isMatch(String s,String p){
        for (int i = 0; i <p.length() && i<s.length() ; i++) {
            if(p.charAt(i)=='*'){
                if(i-1>=0) {
                    if (p.charAt(i - 1) == s.charAt(i)) {
                        String head = p.substring(0, i);
                        String tail = p.substring(i);
                        p = head.concat(head.charAt(i - 1) + "").concat(tail); //增加字符串
                    } else if (p.charAt(i - 1) == '.') {
                        String head = p.substring(0, i);
                        String tail = p.substring(i);
                        p = head.concat(head.charAt(i - 1) + "").concat(tail); //增加字符串
                    } else {
                        p.substring(i);
                    }
                }
            }
        }
        boolean res=true;
        for (int i = 0; i <s.length() ; i++) {
            if(!(s.charAt(i)==p.charAt(i) || p.charAt(i)=='.'))
               return false;
        }
        return true;
    }
}
