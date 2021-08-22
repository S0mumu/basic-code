package cn.rb.April.No10;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author ：rb
 * @version:
 */
public class MKAverage {
    ArrayList<Integer> list;//记录每次添加的元素
    ArrayList<Long> sum;//添加元素的累加和
    long cur;
    int m;
    int k;
    int size;

    //最大的k个元素的小根堆
    PriorityQueue<Integer> maxs=new PriorityQueue<>();
    //最小的k个元素的大根堆
    PriorityQueue<Integer> mins=new PriorityQueue<>((o1,o2)->o2-o1);

    PriorityQueue<Integer> remainMin=new PriorityQueue<>();//剩下的元素组成的最小堆
    PriorityQueue<Integer> remainMax=new PriorityQueue<>((o1,o2)->o2-o1);

    long maxSum,minSum;
    public MKAverage(int m, int k) {
        list=new ArrayList<>();
        sum=new ArrayList<>();
        this.m=m;
        this.k=k;
        this.size=0;
    }

    public void addElement(int num) {
        list.add(num);
        cur+=num;
        sum.add(cur);
        if(size>=m){
            //需要移动一个
            int remove=list.get(size-m);
            if(mins.peek()>=remove){
                mins.remove(remove);
                minSum-=remove;
                int poll=remainMin.poll();// 剩下元素的最小值
                remainMax.remove(poll);
                mins.add(poll);
                minSum+=poll;
            }else if(maxs.peek()<=remove){
                maxs.remove(remove);
                maxSum-=remove;
                int poll=remainMax.poll();
                remainMax.remove(poll);
                maxSum+=poll;
                maxs.add(poll);
            }else{
                remainMax.remove(remove);
                remainMin.remove(remove);
            }
        }

        //添加新元素
        mins.add(num);
        minSum+=num;
        if(mins.size()>k){
            int poll=mins.poll();
            minSum-=poll;
            remainMin.add(poll);
            remainMax.add(poll);
            poll=remainMax.poll();
            remainMin.remove(poll);
            maxs.add(poll);
            maxSum+=poll;
            if(maxs.size()>k){
                poll=maxs.poll();
                maxSum-=poll;
                remainMin.add(poll);
                remainMax.add(poll);
            }
        }
        size++;

    }

    public int calculateMKAverage() {
        if(size<m)
            return -1;
        long a=sum.get(size-1);
        long b=size==m?0:sum.get(size-m-1);
        long cur_sum=a-b;
        cur_sum-=minSum;
        cur_sum-=maxSum;
       return (int) cur_sum/(m-2*k);
    }


}

