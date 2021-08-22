package cn.rb.test1.demo12;

public class Solution {
    /*
    public int minArray(int[] numbers) {
        if(numbers==null)
            return -1;
        for (int i = 0; i <numbers.length-1 ; i++) {
            if(numbers[i]>numbers[i+1])
                return numbers[i+1];
        }
        return numbers[0];
    }

     */

    //二分法
    public int minArray(int[] numbers){
        int i=0,j=numbers.length-1;
        int m=0;
        while(i<j){
            m=(int) (i+j)/2;
            if(numbers[m]>numbers[j])
                i=m+1;
            else if(numbers[m]<numbers[j])
                j=m;
            else
                j=j-1;
        }
        return numbers[i];
    }
}
