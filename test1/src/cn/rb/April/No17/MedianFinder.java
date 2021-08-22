package cn.rb.April.No17;

import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @author ：rb
 * @version:
 */
class MedianFinder {

    PriorityQueue<Integer> maxHeap;
    PriorityQueue<Integer> minHeap;

    /** initialize your data structure here. */
    public MedianFinder() {
        maxHeap=new PriorityQueue<>();
        minHeap=new PriorityQueue<>((o1, o2) -> o2-o1);

    }

    public void addNum(int num) {
        if(maxHeap.size()==minHeap.size()){
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }else{
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }

    }

    public double findMedian() {
        if(minHeap.size()==maxHeap.size())
            return (minHeap.element()+maxHeap.element())/2.0;
        else
            return minHeap.element();

    }
}