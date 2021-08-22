package cn.rb.test1.demo11;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*
        if(headA==null ||headB==null){
            return null;
        }
        ListNode linkA=headA;
        ListNode linkB=headB;
        int lenA=1;
        int lenB=1;
        while(linkA.next!=null){
           lenA++;
           linkA=linkA.next;
        }
        while (linkB.next!=null){
            lenB++;
            linkB=linkB.next;
        }
        if(linkB!=linkA){
            return null;
        }
        if(lenA-lenB==0){
            linkA=headA;
            linkB=headB;
        }else if(lenA-lenB>0){
            linkB=headB;
            linkA=headA;
            for (int i = 0; i <lenA-lenB ; i++) {
                linkA=linkA.next;
            }
        }else{
            linkA=headA;
            linkB=headB;
            for(int i=0;i<lenB-lenA;i++){
                linkB=linkB.next;
            }
        }
        while(linkA!=null && linkB!=null){
            if(linkA==linkB){
                return linkA;
            }linkA=linkA.next;
            linkB=linkB.next;
        }
        return null;

         */


        //双指针法
        if(headA==null || headB==null){
            return null;
        }
        ListNode linkA=headA,linkB=headB;
        while (linkA != linkB) {

            linkA= linkA!=null?linkA.next:headB;
            linkB=linkB!=null?linkB.next:headA;

        }
        return linkA;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.getIntersectionNode(new ListNode(2),new ListNode(8)));
    }
}

