package cn.rb.test1.demo20;

import java.util.Stack;

public class Solution {
    /*
    public TreeNode mirrorTree(TreeNode root) {
        if(root ==null)
            return null;
        if(root.left!=null || root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            mirrorTree(root.left);
            mirrorTree(root.right);
        }
        return root;
    }

     */
     /*
     用堆、栈的思想
      */
    public TreeNode mirrorTree(TreeNode root){
        if(root ==null)
            return null;
        Stack<TreeNode> mystack=new Stack<>();
        mystack.push(root);
        while(!mystack.isEmpty()){
            TreeNode node=mystack.pop();
            if(node.left!=null){
                mystack.push(node.left);
            }
            if(node.right!=null){
                mystack.push(node.right);
            }
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
        }
        return root;
    }
}
