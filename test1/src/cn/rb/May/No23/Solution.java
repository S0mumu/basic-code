package cn.rb.May.No23;

import java.util.HashMap;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head,int n){
        if(head==null || n<0 )
            return null;
        HashMap<Integer,ListNode> myMap=new HashMap<>();
        int index=0;
        ListNode temp=head;
        myMap.put(index++,temp);
        while(temp.next!=null){
            myMap.put(index++,temp.next);
            temp=temp.next;
        }
        int cur=index-n; // 需要删除节点的下标
        System.out.println(cur);
        if (cur<index && cur>=0) {
            if (myMap.get(cur + 1) != null && myMap.get(cur-1)!=null) {
                System.out.println(1);
                myMap.get(cur - 1).next = myMap.get(cur + 1);
            }
            else if(myMap.get(cur+1)==null && myMap.get(cur-1)!=null) {
                System.out.println(2);
                myMap.get(cur - 1).next = null;
            }
            else if(myMap.get(cur+1)!=null && myMap.get(cur-1)==null){
                head=myMap.get(cur+1);
            }
            else{
                System.out.println(3);
                head=null;
            }
        }
        return head;
    }
}
