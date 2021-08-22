package cn.rb.test1.demo36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] findContinuousSequence(int target){
        int i=1,j=1;
        List<int []> result=new ArrayList<>();
        while (i<=target/2){
            int sum=(i+j-1)*(j-i)/2;
            if(sum==target){
                int[] temp=new int[j-i];
                for (int k = i; k <j ; k++) {
                    temp[k-i]=k;

                }
                result.add(temp);
                i++;

            }
            else if(sum<target){
                j++;
            }else{
                i++;
            }

        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int [][]ll=s.findContinuousSequence(12);
        for (int i = 0; i <ll.length ; i++) {
            System.out.println(Arrays.toString(ll[i]));

        }

    }
}
