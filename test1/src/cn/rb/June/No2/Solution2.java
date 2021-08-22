package cn.rb.June.No2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
class Solution2 {
    List<List<Integer>> result;
    List<Integer> temp;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Arrays.sort(candidates);
        result = new ArrayList<>();
        temp = new ArrayList<>();
        search(candidates, target, 0);
        for (int i = 0; i <result.size() ; i++) {
            System.out.println(result.get(i).toString());
        }
        return result;

    }

    public void search(int[] candidates, int target, int s) {
        //System.out.println(Arrays.toString(temp.toArray()));
        if (target == 0) {
            List<Integer> hh = new ArrayList<>(temp);
            result.add(hh);
            return;
        }
        if (s >= candidates.length) {
            return;
        }


        search(candidates,target,s+1);//直接跳过
        if(target-candidates[s]>=0){
            temp.add(candidates[s]);
            search(candidates,target-candidates[s],s);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        Solution2 solution2=new Solution2();
        solution2.combinationSum(new int[]{2,3,6,7},7);
    }
}
