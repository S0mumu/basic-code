package cn.rb.June.No11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        search(nums,0,temp,result);
        return result;

    }

    public void search(int[] nums,int index,List<Integer> cur,List<List<Integer>> result){
        if(index>=nums.length){
            result.add(new ArrayList<>(cur));
            return;
        }
        //index 取
        cur.add(nums[index]);
        search(nums,index+1,cur,result);
        //index 不取
        cur.remove(cur.size()-1);
        search(nums,index+1,cur,result);
    }
}
