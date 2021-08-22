package cn.rb.test1.demo18;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode front=head;
        ListNode current=head.next;
        ListNode tail=null;
        while(current!=null){
            current.next=tail;
            tail=current;
            current=front;
            front=front.next;
        }
        return tail;
    }

    public static void main(String[] args) {
       // System.out.println(null==True);
    }

}
