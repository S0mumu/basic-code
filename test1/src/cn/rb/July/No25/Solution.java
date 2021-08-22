package cn.rb.July.No25;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        for (int i=0;i<T;i++){
            int N=scanner.nextInt();
            int[] A=new int[N];
            int L=0;
            for (int j = 0; j <N ; j++) {
                A[j]=scanner.nextInt();
                L+=A[j];
            }

            int flag=1;
            //判断是否可以完美切分
            for (int j = 1; j <L ; j++) {
                if(!search(A,j,0,0)){
                    System.out.println("no");
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println("yes");
            }
        }
    }
    public static boolean search(int[] list,int target,int val,int index){
        //System.out.println(index);
        if(val>target || index>=list.length){
            return false;
        }
        if(val==target){
            return true;
        }

        //选这个数
        return search(list,target,val+list[index],index+1)||search(list,target,val,index+1);
    }
}
