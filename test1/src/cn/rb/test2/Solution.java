package cn.rb.test2;

import java.util.Stack;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> result=new Stack<>();
        int rr=0;
        ListNode head=new ListNode();
        head.val=(l1.val+l2.val)%10;
        rr=(l1.val+l2.val)/10;
        result.push(head);
        while((l1.next!=null) && (l2.next!=null)){
            ListNode temp=new ListNode();
            l1=l1.next;
            l2=l2.next;
            temp.val=(l1.val+l2.val+rr)%10;
            rr=(l1.val+l2.val+rr)/10;
            result.push(temp);
        }
        while(l1.next!=null){
            if(rr!=0){
                ListNode temp=new ListNode();
                l1=l1.next;
                temp.val=(l1.val+rr)%10;
                rr=(l1.val+rr)/10;
                result.push(temp);
            }else {
                l1=l1.next;
                result.push(l1);
            }

        }
        while(l2.next!=null){
            if(rr!=0){
                ListNode temp=new ListNode();
                l2=l2.next;
                temp.val=(l2.val+rr)%10;
                rr=(l2.val+rr)/10;
                result.push(temp);
            }else {
                l2=l2.next;
                result.push(l2);
            }

        }
        if(rr!=0){
            ListNode last=new ListNode(rr);
            result.push(last);
        }

        ListNode trial=result.pop();
        while(!result.isEmpty()){
            ListNode temp=result.pop();
            temp.next=trial;
            trial=temp;
        }

        return trial;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        ListNode n1=new ListNode(3);
        ListNode n2=new ListNode(7);

        ListNode l1=new ListNode(9);
        ListNode l2=new ListNode(2);

        n1.next=n2;


        l1.next=l2;

        ListNode temp=s.addTwoNumbers(n1,l1);
        System.out.println(temp.val);
        while(temp.next!=null){
            temp=temp.next;
            System.out.println(temp.val);
        }

    }
}
