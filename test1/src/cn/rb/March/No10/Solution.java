package cn.rb.March.No10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public boolean inSubStructure(TreeNode A,TreeNode B){
        if(A==null||B==null) return false;

        Queue<TreeNode> myQueue=new LinkedList<>();
        myQueue.offer(A);
        while(!myQueue.isEmpty()){
            TreeNode temp=myQueue.poll();
            if(temp.val==B.val){
                //查看一下两个数是否相同结构
                if(isSame(temp,B)){
                    return true;
                }
            }
            if(temp.left!=null)
                myQueue.offer(temp.left);
            if(temp.right!=null)
                myQueue.offer(temp.right);
        }
        return false;
    }
    public boolean isSame(TreeNode temp,TreeNode B){
        if(B.left==null && B.right==null)
            return true;
        if(B.left!=null){
            if(temp.left==null||temp.left.val!=B.left.val||
            !isSame(temp.left,B.left))
                return false;

        }
        if(B.right!=null){
            if(temp.right==null||temp.right.val!=B.right.val||
            !isSame(temp.right,B.right))
                return false;
        }
        return true;
    }
}
