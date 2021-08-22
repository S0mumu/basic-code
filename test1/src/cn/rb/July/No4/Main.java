package cn.rb.July.No4;

/**
 * @author ：rb
 * @version:
 */

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String s=scanner.next().trim();
            s=s.substring(2);
            int num=0;
            for(int i=s.length()-1;i>=0;i--){
                num=num<<4;
                char k=s.charAt(i);
                if(k>='A' && k<='F'){
                    num+=k-'A'+10;
                }else{
                    num+=k-'0';
                }
            }
            System.out.println(num);
        }
    }
}