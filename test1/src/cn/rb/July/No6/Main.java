package cn.rb.July.No6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author ：rb
 * @version:
 */
public class Main {
    static int count=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int n= in.nextInt();
            int sum = in.nextInt();
            Integer[] arr=new Integer[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=in.nextInt();
            }
            Arrays.sort(arr);
            search(arr,sum,0);
            System.out.println(count);
            count=0;

    }
    public static void search(Integer[] arr, Integer sum, Integer k){
        if(sum==0) {
            count++;
            return;
        } else if(k>=arr.length || sum<0){
            return;
        }
        //选

        search(arr,sum-arr[k],k+1);
        // 不选
        //k--;
        //sum+=arr[k];
        search(arr,sum,k+1);

    }

}

