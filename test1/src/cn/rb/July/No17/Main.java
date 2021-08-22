package cn.rb.July.No17;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();
        long c=in.nextLong();
        long total=2*a+3*b+4*c;
        long count=a+b+c;
        long temp=7*count-2*total;
        long index=(7*count-2*total)%3;
        if(index==0){
            System.out.println(temp/3);
        }else{
            System.out.println(temp/3+1);
        }

    }

}