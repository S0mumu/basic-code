package cn.rb.May.No1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：rb
 * @version:
 */
class Node{
    int val;
    Node next;
    Node random;
    public Node(int val){
        this.val=val;
        this.next=null;
        this.random=null;
    }
}
public class Solution {
    public Node copyRandomList(Node node){
        if(node==null)
            return null;
        Map<Node,Node> dic=new HashMap<>();
        Node temp=node;
        while(temp.next!=null){
            dic.put(temp,new Node(temp.val));
            temp=temp.next;
        }
        temp=node;
        while (temp!=null){
            dic.get(temp).next=dic.get(temp.next);
            dic.get(temp).random=dic.get(temp.random);
            temp=temp.next;
        }
        return dic.get(node);
    }
}
