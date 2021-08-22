package cn.rb.April.No7;

import java.util.ArrayList;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int nthUglyNumber(int n){
        int[] myresult=new int[n];
        myresult[0]=1;
        int i1=0;
        int i2=0;
        int i3=0;
        for(int i=1;i<n;i++){
            myresult[i]=Math.min(Math.min(myresult[i1]*2,myresult[i2]*3),myresult[i3]*5);
            if(myresult[i]==myresult[i1]*2){
                i1++;
            }
            if(myresult[i]==myresult[i2]*3){
                i2++;

            }
            if(myresult[i]==myresult[i3]*5){
                i3++;
            }
        }
        return myresult[n-1];
    }
}
