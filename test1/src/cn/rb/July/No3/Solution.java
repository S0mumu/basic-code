package cn.rb.July.No3;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public ListNode detectCycle(ListNode head){
        if(head==null)
            return null;
        ListNode fast=head;
        ListNode slow=head;
        while(true){
            if (fast==null || fast.next==null){
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow){
                break;
            }
        }
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}

class ListNode{
    ListNode next;
    int val;
    ListNode(int x){
        val=x;
        next=null;
    }
}
