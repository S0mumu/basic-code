package cn.rb.test1.demo17;

public class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null)
            return null;
        int length=1;
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
            length++;
        }
        current=head;
        for (int i = 1; i <length-k+1 ; i++) {
            current=current.next;
        }
        return current;
    }

}
