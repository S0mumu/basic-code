package cn.rb.June.No23;

/**
 * @author ：rb
 * @version:
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}
public class Solution {
    public boolean hasCycle(ListNode head){
        ListNode t1=head;// 慢指针
        ListNode t2=head.next;//快指针
        while(t1!=t2){
            if(t2==null|| t2.next==null){
                return false;
            }
            t1=t1.next;
            t2=t2.next.next;
        }

        return true;
    }
}
