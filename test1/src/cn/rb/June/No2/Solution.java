package cn.rb.June.No2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    List<List<Integer>> result;
    List<Integer> temp;
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        Arrays.sort(candidates);
        result=new ArrayList<>();
        temp=new ArrayList<>();
        search(candidates,target,candidates.length-1);
        for (int i = 0; i <result.size() ; i++) {
            System.out.println(result.get(i).toString());
        }
        return result;

    }

    public void search(int[] candidates,int target,int s ){
        //System.out.println(Arrays.toString(temp.toArray()));
        if(target==0){
            List<Integer> hh=new ArrayList<>();
            for (int i = 0; i <temp.size() ; i++) {
                hh.add(temp.get(i));
            }
            result.add(hh);
            return ;
        }
       if(target<0 ||s<0){
           return ;
       }
        int times=target/candidates[s];
        for (int i = 0; i <=times ; i++) {
            target-=candidates[s]*i;
            for (int j = 0; j <i ; j++) {
                temp.add(candidates[s]);
            }
            search(candidates,target,s-1);
            target+=candidates[s]*i;
            for (int j = 0; j <i ; j++) {
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.combinationSum(new int[]{2,3,6,7},7);
    }
}
