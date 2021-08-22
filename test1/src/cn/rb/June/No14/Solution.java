package cn.rb.June.No14;
import java.util.HashMap;


/**
 * @author ：rb
 * @version:
 */
public class Solution {

    public int[] twoSum(int[] nums,int target){

        HashMap<Integer,Integer> myMap=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(myMap.containsKey(target-nums[i])){
                return new int[]{i,myMap.get(target-nums[i])};
            }
            myMap.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.twoSum(new int[]{2,7,11,15},9);
    }


}
