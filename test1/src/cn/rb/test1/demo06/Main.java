package cn.rb.test1.demo06;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        solution s=new solution();
        ListNode h=new ListNode(1);
        h.next=new ListNode(3);
        h.next.next=new ListNode(2);
        int [] hhh=s.reversePrint(h);
        for (int i = 0; i <hhh.length ; i++) {
            System.out.println(hhh[i]);
        }
    }
}
class solution{
    public int[] reversePrint(ListNode head){
        Stack<ListNode> s=new Stack<>();
        while(head != null){
            s.push(head);
            head=head.next;
        }
        int size=s.size();
        int [] re=new int[size];
        for (int i = 0; i <size ; i++) {
            re[i]=s.pop().val;
        }
        return re;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
