package cn.rb.April.No9;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution implements Cloneable {
    public int minSideJumps(int[] obstacles) {
        int[] arr=new int[obstacles.length];
        arr[0]=2;
        int res=0;
        int [] hh=new int[3];
        System.out.println(hh[0]);
        for (int i=1;i<obstacles.length;i++){

            if (obstacles[i]==arr[i-1]){
                //前方遇到
                res++;
                //选择跳转
                //1. i-1的位置上，有石头，且这个石头一定不是位于dp[i-1]的位置上
                if(obstacles[i-1]!=0 && obstacles[i-1]!=arr[i-1]){
                    //只有一个位置可以选择，跳转
                    arr[i]=6-arr[i-1]-obstacles[i-1];
                }else {
                    //i-1的位置上没有石头，有两条路可以选择
                    //贪心的选择一条出现石头更后面的路

                    //如果遇到了最后，没有石头了，则随意选择一条路
                    if(arr[i-1]==1){
                        arr[i]=2;
                    }else if(arr[i-1]==2){
                        arr[i]=3;
                    }else{
                        arr[i]=1;
                    }
                    for (int j = i+1; j <obstacles.length ; j++) {
                        if(obstacles[j]!=0 && obstacles[j]!=arr[i-1]){
                            arr[i]=6-arr[i-1]-obstacles[j];
                            break;
                        }
                    }

                }
            }else{
                arr[i] = arr[i - 1];
            }
        }
        //System.out.println(Arrays.toString(arr));
        return res;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.minSideJumps(new int[]{0,1,0,1,3,1,1,1,0,2,0}));

        String str=new String();
        int [] hh=new int[3];
        System.out.println(hh[0]);
    }
}
