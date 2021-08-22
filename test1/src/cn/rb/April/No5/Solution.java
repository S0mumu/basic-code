package cn.rb.April.No5;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public void merge(int[] A,int m,int[] B,int n){
        int i=m-1;
        int j=n-1;
        for(int a=A.length-1;a>=0;a--){
            if(i<0) {
                A[a] = B[j--];
            }
            else if(A[i]>=B[j]){
                A[a]=A[i--];
            }else if(A[i]<B[j]){
                A[a]=B[j--];
            }else if(j<0){
                break;
            }

        }
    }

    public static void main(String[] args) {
        int[] m={0};
        int[] n={1};
        m=n;
        System.out.println(Arrays.toString(m));
    }
}
