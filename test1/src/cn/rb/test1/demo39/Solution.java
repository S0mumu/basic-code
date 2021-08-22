package cn.rb.test1.demo39;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    /*
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || nums.length==0)
            return null;
        int[] res=new int[nums.length-k+1];
        for (int i = 0; i <nums.length-k+1 ; i++) {
            int max=nums[i];
            for (int j = 1; j <k ; j++) {
                if(max<nums[i+j])
                    max=nums[i+j];
            }
            res[i]=max;
        }
        return res;
    }

     */
    public int[] maxSlidingWindow(int[] nums,int k){
        //使用队列存储，保证队列中的元素是从大到小排列
        if(nums==null||nums.length==0||k==0)
            return new int[]{};
        Deque<Integer> deque=new LinkedList<>();
        int res[]=new int[nums.length-k+1];
        for (int i = 0; i <k ; i++) {// 还未形成一个滑动窗口
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
        }
        res[0]=deque.peekFirst();
        for (int i = k; i <nums.length ; i++) {
            if(deque.peekFirst()==nums[i-k]){
                deque.removeFirst();
            }
            while(!deque.isEmpty()&&deque.peekLast()<nums[i]){
                deque.removeLast();
            }
            deque.addLast(nums[i]);
            res[i-k+1]=deque.peekFirst();
        }
        return res;

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(Arrays.toString(s.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
}
