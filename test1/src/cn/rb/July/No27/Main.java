package cn.rb.July.No27;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long x=sc.nextInt();
        long y=sc.nextInt();
        long m=sc.nextInt();
        long count=0;
        if(m<0 && x>=0 && y>=0){
            System.out.println(-1);
        }else if(m>0 && x<=0 && y<=0){
            System.out.println(-1);
        }else{
            while(x<m && y<m){
                count++;
                long temp=Math.max(x,y);
                if(temp==x){
                    y=x+y;
                }else{
                    x=x+y;
                }
            }
            System.out.println(count);
        }

    }
}