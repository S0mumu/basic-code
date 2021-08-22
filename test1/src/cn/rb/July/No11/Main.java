package cn.rb.July.No11;

import java.util.*;
public class Main{
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        long [] arr =new long [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        long count=0;
        while(!isValid(arr)){
            long max=0;
            int index=0;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                    index=i;
                }
            }
                count+=max/n;
                for(int i=0;i<n;i++){
                    arr[i]+=max/n;

                }
                arr[index]=max%n;
        }
        System.out.println(count);
    }

    public static boolean isValid(long[] arr){
        boolean flag =true;
        for(long i:arr){
            if(i>=arr.length) {
                return false;
            }
        }
        return flag;
    }
}