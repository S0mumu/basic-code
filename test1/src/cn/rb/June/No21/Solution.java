package cn.rb.June.No21;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public ListNode rotateRight(ListNode head,int k){
        if(k==0 || head==null)
            return head;
        int count=1;
        ListNode temp=head;

        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        ListNode tail=temp;
        temp=head;
        for (int i = 2; i <=count-k%count ; i++) {
            temp=temp.next;
        }
        ListNode temp2=temp.next;
        tail.next=head;
        temp.next=null;
        return temp2;
    }

}
