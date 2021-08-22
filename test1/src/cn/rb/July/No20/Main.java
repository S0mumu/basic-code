package cn.rb.July.No20;

import java.util.*;

/**
 * @author ：rb
 * @version:
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        s=s.substring(1,s.length()-1);
        String[] split = s.split(",");
        int i=0;
        int j=0;
        while(i<split.length&& !split[i].equals("0")){
            i++;
        }
        j=i;
        while(j<split.length && split[j].equals("0")){
            j++;
        }
        while(i<=split.length-1 && j<=split.length-1){
            split[i]=split[j];
            split[j]="0";
            i++;
            j++;
            while(i<split.length&& !split[i].equals("0")){
                i++;
            }
            while(j<split.length && split[j].equals("0")){
                j++;
            }
        }

    }
}
