package cn.rb.March.No9;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public boolean isNumber(String s) {
        if(s==null || s.length()==0){
            return false;
        }
        boolean isNum=false,isDot=false,ise_or_E=false;//标记是都遇到了数字、小数点、e
        char[] str=s.trim().toCharArray();
        for(int i=0;i<str.length;i++){// 遍历每个位置
            if(str[i]>='0' && str[i]<='9')
                isNum=true;
            else if(str[i]=='.'){
                if(isDot)//之前已经遇到过小数点
                    return false;
                isDot=true;//标记已经遇到了小数点
            }else if(str[i]=='e'|| str[i]=='E'){
                if(!isNum || ise_or_E)
                    return false;
                ise_or_E=true;
                isNum=false;//e后面也是数字
            }else if(str[i]=='+'|| str[i]=='-'){
                if(i!=0 && str[i-1]!='e' && str[i-1]!='E')
                    return false;
            }else
                return false;

        }
        return isNum;

    }


}
