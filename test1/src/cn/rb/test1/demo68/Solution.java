package cn.rb.test1.demo68;

import cn.rb.test1.demo68.TreeNode;

import java.util.ArrayList;


/**
 * @author ：rb
 * @version:
 */

public class Solution {
    public TreeNode lowerCommonAnscestor(TreeNode root,TreeNode p,TreeNode q){
        ArrayList<TreeNode> path_p=search(root,p);
        ArrayList<TreeNode> path_q=search(root,q);
        if(path_p==null || path_q==null||root==null)
            return null;
        TreeNode temp=root;
        for (int i = 1; i <(path_p.size()<path_q.size()?path_p.size():path_q.size()) ; i++) {
            if(path_p.get(i)==path_q.get(i))
                temp=path_p.get(i);
        }
        return temp;

    }
    public ArrayList<TreeNode> search(TreeNode root,TreeNode target){
        ArrayList<TreeNode> path=new ArrayList<>();
        if(root!=null)
            path.add(root);
        TreeNode temp=root;//指针用于指示当前的节点
        if(temp.val==target.val)
            return path;
        while(temp.val!=target.val){
            if(temp.val>target.val){
                //左子树
                if(temp.left!=null){
                    temp=temp.left;
                    path.add(temp);
                }else{
                    //节点不存在
                    return null;
                }
            }else{
                //右子数
                if(temp.right!=null){
                    temp=temp.right;
                    path.add(temp);
                }else{
                    return null;
                }
            }

        }
        return path;
    }

}
