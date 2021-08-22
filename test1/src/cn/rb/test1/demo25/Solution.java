package cn.rb.test1.demo25;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
//    public int majorityElement(int [] nums){
//        HashMap<Integer, Integer> myHashMap= new HashMap<>();
//        for (int i = 0; i <nums.length ; i++) {
//            if (myHashMap.containsKey(i)){
//                myHashMap.put(nums[i],myHashMap.get(nums[i])+1);
//            }else{
//                myHashMap.put(nums[i],1);
//            }
//        }
//        for (Integer i: myHashMap.keySet()) {
//            if(myHashMap.get(i)*2>nums.length){
//                return i;
//            }
//        }
//        return 0;
//    }
    /*
    使用排序法，求出现的元素次数大于数组长度一半的元素
     */
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i <nums.length/2 ; i++) {
            if(nums[i]==nums[i+nums.length/2])
                return nums[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] test={1,7,6};
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
    }
}
