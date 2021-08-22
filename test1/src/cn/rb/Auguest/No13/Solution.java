package cn.rb.Auguest.No13;

import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int minStoneSum(int[] piles, int k) {

        int temp=0;
        int flag=0;
        int index=piles.length;
        Arrays.sort(piles);
        for (int i = 0; i <k ; i++) {
            if(index<=0 || (flag==1 && temp>piles[index-1])){
                Arrays.sort(piles);
                index=piles.length;
                flag=0;
            }
            //System.out.println(Arrays.toString(piles));
            if(piles[index-1]%2==0){
                piles[index-1]=piles[index-1]/2;
            }else{
                piles[index-1]=piles[index-1]/2+1;
            }
            if(flag==0){
                temp=piles[piles.length-1];
                flag=1;
            }
            index--;
            //System.out.println(Arrays.toString(piles));
        }
        int res=0;
        for (int i = 0; i <piles.length ; i++) {
            res+=piles[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.minStoneSum(new int[]{1},6));
    }
}
