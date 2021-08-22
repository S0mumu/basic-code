package cn.rb.May.No13;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int[] constructArr(int[] a){
        if(a==null || a.length==0)
            return new int[]{};
        int[] res=new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            if(i==0)
                res[i]=1;
            else{
                res[i]=res[i-1]*a[i-1];
            }
        }
        int temp=1;
        for (int i = a.length-2; i >=0 ; i--) {
            temp*=res[i+1];
            res[i]*=temp;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(0b10);
    }
}
