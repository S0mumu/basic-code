package cn.rb.test1.demo19;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode head=new ListNode(0);
        while (t1!=null && t2!=null){
            if(t1.val<=t2.val){
                head.next=t1;
                t1=t1.next;
            }else{
                head.next=t2;
                t2=t2.next;
            }
            head=head.next;
        }
        if(t1!=null){
            head.next=t1;
        }else if(t2!=null){
            head.next=t2;
        }
        return head.next;
    }
}
