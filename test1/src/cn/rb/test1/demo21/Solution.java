package cn.rb.test1.demo21;

import javax.swing.*;
import java.util.Stack;

public class Solution {
    public boolean isSymmetric(TreeNode root){
        if(root==null)
            return true;

        return recur(root.left,root.right);
    }
    public boolean recur(TreeNode left,TreeNode right){
        if(left==null && right==null)
            return true;
        if(left==null || right ==null || left.val!=right.val)
            return false;
        return recur(left.left,right.right) && recur(left.right,right.left);
    }
}
