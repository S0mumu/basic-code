package cn.rb.June.No18;

/**
 * @author ：rb
 * @version:
 */
class Solution {
    public String multiply(String num1, String num2) {
        if(num1==null || num2==null ||num1.length()==0||num2.length()==0){
            return new String();
        }
        int m=num1.length();
        int n=num2.length();
        int[] result=new int[m+n];
        for (int i = m-1; i>=0 ; i--) {
            int cur_i=num1.charAt(i)-'0';
            for (int j = n-1; j >=0 ; j--) {
                int cur_j=num2.charAt(j)-'0';
                result[i+j+1]+=cur_i*cur_j;
            }
        }

        for (int i = m+n-1; i >0 ; i--) {
            result[i-1]+=result[i]/10;
            result[i]=result[i]%10;
        }
        int index=0;
        if(result[0]==0){
            index=1;
        }
        StringBuffer sb=new StringBuffer();
        while(index<m+n){
            sb.append(result[index]);
            index++;
        }
        return sb.toString();

    }

}
