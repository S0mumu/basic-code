package cn.rb.April.No11;

import java.util.Stack;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int minDiffInBST(TreeNode root){
        if(root==null)
            return -1;
        int res=Integer.MAX_VALUE;
        Stack<TreeNode> myStack=new Stack<>();
        myStack.push(root);
        while(!myStack.isEmpty()){
            TreeNode temp=myStack.pop();
            res=searchRes(temp,res);
            if(temp.left!=null){
                myStack.push(temp.left);
            }
            if(temp.right!=null){
                myStack.push(temp.right);
            }
        }
        return res;

    }
    public int searchRes(TreeNode root,int res){
        if(root.left!=null){
            TreeNode temp=root.left;
            while(temp.right!=null){
                temp=temp.right;
            }
            if(res>root.val-temp.val){
                res=root.val-temp.val;
            }
        }
        if(root.right!=null){
            TreeNode temp=root.right;
            while(temp.left!=null){
                temp=temp.left;
            }
            if(res>temp.val-root.val){
                res=temp.val-root.val;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
