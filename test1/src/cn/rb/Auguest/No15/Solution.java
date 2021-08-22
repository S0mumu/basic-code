package cn.rb.Auguest.No15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ：rb
 * @version:
 */

class ListNode{
    int val;
    ListNode next=null;
    public ListNode(int val){
        this.val=val;
    }
}
public class Solution {
    public static ListNode addTwoNumbers(ListNode n1,ListNode n2) {
        if(n1==null && n2==null){
            return null;
        }
        if(n1==null){
            return n2;
        }
        if(n2==null){
            return n1;
        }
        long t1=0;
        long t2=0;
        int flag=1;
        while(n1!=null) {
            t1=n1.val*flag+t1;
            n1=n1.next;
            flag*=10;
        }
        flag=1;
        while(n2!=null) {
            t2=t2+n2.val*flag;
            n2=n2.next;
            flag*=10;
        }

        long total=t1+t2;

        ListNode temp=null;
        ListNode head=null;
        while (total!=0) {
            ListNode newnode=new ListNode((int)total%10);
            if(head==null) {
                head=newnode;
                temp=head;
            }else {
                temp.next=newnode;
                temp=temp.next;
            }
            total=total/10;
        }
        if (temp!=null) {
            temp.next=null;
        }
        return head;
    }
    public static void main(String... __A_V_) {
        String $="";
        for (int i = 0; i++ <__A_V_.length ;) {
            $+=__A_V_[i];
            System.out.println($);
        }

    }
    public static void append(StringBuffer a,StringBuffer b){
        a.append(b);
        b=a;
    }
}
