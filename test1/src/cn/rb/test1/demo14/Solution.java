package cn.rb.test1.demo14;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Math.pow;

public class Solution {
/*
    // 打印从1到最大为n维所有数字
    public int[] printNumbers(int n) {
        int finalNumber=(int) pow(10,n);
        int[] result=new int[finalNumber-1];
        for (int i = 0; i <finalNumber-1 ; i++) {
            result[i]=i+1;
        }
        return result;
    }
*/


    //大数打印法
    StringBuilder s;
    int n;
    int start;
    char[] num;
    int[] result;
    int count;
    int nine;
    char[] numbers={'0','1','2','3','4','5','6','7','8','9'};
    public int[] printNumbers(int n){
        this.n=n;//用于存储最大的数字位数
        num=new char[n];//用于存储一个数字
        result=new int[(int) (Math.pow(10,n)-1)];
        count=0;
        start=n-1;//用于表示一个数字开始的下标位数，最开始是一位数
        dfs(0);
        return result;
    }
    public void dfs(int a){
        if(a==n){
            //表明已经遍历完产生了一个数字
            String temp=String.valueOf(num).substring(start);
            if(Integer.parseInt(temp)!=0) {
                result[count] = Integer.parseInt(temp);
                count++;
            }
            if(n-nine==start){
                start--;
            }
            return ;
        }
        for (char i:numbers) {
            if(i=='9'){
                nine++;
            }
            num[a]=i;
            dfs(a+1);

        }
        nine--;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(Arrays.toString(s.printNumbers(3)));

    }
}
