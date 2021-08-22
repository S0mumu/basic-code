package cn.rb.test1.demo26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k==0)
            return new int[0];
        /*
        Queue<Integer> heap=new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o2>o1)
                    return 2;
                else if(o2<o1)
                    return -2;
                else
                    return 0;

                //return o2.compareTo(o1);

            }
        });
        */
        /*使用lamda表达式显示priorityQueue 的comparetor
         */
        Queue<Integer> heap=new PriorityQueue<>(k,(i,j) ->j-i);
        for(int a:arr){
            if(heap.isEmpty()||heap.size()<k||a<heap.peek()){
                heap.offer(a);
            }
            if(heap.size()>k){
                heap.poll();
            }

        }
        int[] res=new int[heap.size()];
        int j=0;
        for(int e:heap){
            res[j++]=e;
        }
        return res;

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(Arrays.toString(s.getLeastNumbers(new int[]{1,9,7,2,3},2)));
       // System.out.println(Integer.compare(5,4));
    }

}
