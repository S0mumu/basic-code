package cn.rb.Auguest.No8;

import apple.laf.JRSUIUtils;

import java.util.*;

/**
 * @author ：rb
 * @version:
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<TreeNode> myQueue=new LinkedList<>();
        myQueue.add(new TreeNode(sc.nextInt()));
        TreeNode head=myQueue.peek();
        while(sc.hasNext() && !myQueue.isEmpty()){
            TreeNode temp=myQueue.remove();
            String s=sc.next();
            TreeNode left=null;
            if(s=="null"){
                left=null;

            }else {
                left=new TreeNode(Integer.parseInt(s));

            }
            temp.left=left;
            myQueue.add(left);
            s=sc.next();
            TreeNode right=null;
            if(s=="null"){
                right=null;
            }else {
                right=new TreeNode(Integer.parseInt(s));
            }
            temp.right=right;
            myQueue.add(right);
        }

        //getPath(head);


    }

//    public static void getPath(TreeNode temp){
//        //深度遍历
//        Stack<TreeNode> myStack=new Stack<>();
//        while()
//
//    }
}
