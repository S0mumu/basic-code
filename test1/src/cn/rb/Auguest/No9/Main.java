package cn.rb.Auguest.No9;

/**
 * @author ：rb
 * @version:
 */
import java.util.*;
class Main{
    static int[] lists=null;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        lists=new int[n+1];
        for(int i=2;i<=n;i++){
            //求i是否是质数
            for(int j=2;j<i;j++){
                if(i%j!=0){
                    lists[j]=1;
                }
            }
        }
        while(n!=-1 && n>1){
            int index=search(n);
            System.out.print(index+" ");
            n=n/index;

        }

    }
    public static int search(int n){
        for(int i=2;i<=lists.length;i++){
            if(lists[i]==1 && n%i==0){
                return i;
            }
        }
        return -1;
    }
}