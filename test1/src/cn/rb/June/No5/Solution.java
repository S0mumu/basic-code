package cn.rb.June.No5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int[][] merge(int[][] intervals){
        if(intervals.length==0){
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        List<int[]> merged=new ArrayList<>();
        for (int i = 0; i <intervals.length ; i++) {
            int L=intervals[i][0];
            int R=intervals[i][1];
            {
                if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L){
                    merged.add(new int[]{L,R});
                }else{
                    merged.get(merged.size()-1)[1]=Math.max(R,merged.get(merged.size()-1)[1]);
                }
            }
        }
        return merged.toArray(new int[merged.size()][2]);
    }
}
