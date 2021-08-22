package cn.rb.May.No1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：rb
 * @version:
 */

public class Solution2 {
    public Node copyRandomList(Node node){
        if(node==null)
            return null;
        Node temp=node;
        while (temp!=null){
            Node cur=new Node(temp.val);
            cur.next=temp.next;
            temp.next=cur;
            temp=temp.next.next;
        }

        temp=node;
        while(temp!=null){
            if(temp.random!=null)
                temp.next.random=temp.random.next;
            temp=temp.next.next;
        }

        temp=node.next;
        Node pre=node,res=node.next;
        while(temp.next!=null){
            pre.next=pre.next.next;
            temp.next=temp.next.next;
            pre=pre.next;
            temp=temp.next;
        }
        pre.next=null;
        return res;
    }

    public static void main(String[] args) {
        System.out.println((long) 01011);
    }
}
