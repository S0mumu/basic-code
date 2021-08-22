package cn.rb.test1.demo15;

public class Solution {


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public ListNode deleteNode(ListNode head, int val) {
        if(head==null)
            return null;
        ListNode in =head;
        if(head.val==val){
            return head.next;
        }
        while(in.next!=null){
            if(in.next.val==val){
                in.next=in.next.next;
            }else {
                in = in.next;
            }
        }

        return head;
    }

}
