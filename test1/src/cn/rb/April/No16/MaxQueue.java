package cn.rb.April.No16;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：rb
 * @version:
 */
public class MaxQueue {

    Queue<Integer> myQueue;
    Deque<Integer> myDeque;//用于存储最大的树列表

    public MaxQueue() {
        myQueue=new LinkedList<>();
        myDeque=new LinkedList<>();
    }

    public int max_value() {
        if(myDeque.isEmpty())
            return -1;
        return myDeque.peekFirst();

    }

    public void push_back(int value) {
        while(!myDeque.isEmpty() && myDeque.peekLast()<value){
            myDeque.pollLast();
        }
        myDeque.offerLast(value);
        myQueue.offer(value);

    }

//    public int pop_front() {
//        if(myQueue.isEmpty())
//            return -1;
//        int ans=myQueue.poll();
//        if(ans==myDeque.peekFirst()){
//            myDeque.pollFirst();
//        }
//
//        return ans;
//    }


    public int pop_front() {
        if(myQueue.isEmpty())
            return -1;
        if(myDeque.peekFirst().equals(myQueue.peek())){
            myDeque.removeFirst();

        }
        int res=myQueue.poll();
        return res;
    }

    public static void main(String[] args) {

        MaxQueue max=new MaxQueue();
        max.myDeque.add(525);
        max.myQueue.add(525);
        max.pop_front();
    }
}



