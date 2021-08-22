package cn.rb.test1.demo68_2;

import java.util.Stack;

/**
 * @author ：rb
 * @version:
 * @desciprtion: 二叉树的最近公共祖先
 */
public class Solution {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        Stack<TreeNode> path_p=getpath(root,p,new Stack<>());
        Stack<TreeNode> path_q=getpath(root,q,new Stack<>());
        if(path_p==null || path_q==null||root==null)
            return null;
        TreeNode temp=root;
        for (int i = 1; i <(path_p.size()<path_q.size()?path_p.size():path_q.size()) ; i++) {
            if(path_p.get(i)==path_q.get(i))
                temp=path_p.get(i);
        }
        return temp;

    }

    public static Stack<TreeNode> getpath(TreeNode root, TreeNode target, Stack<TreeNode> path){
        if(root==null||target==null){
            return null;
        }
        path.add(root);
        if(root.val==target.val) {
            return path;
        }
        else{
            //遍历树，寻找节点
            if (getpath(root.left, target, path) == null && getpath(root.right, target, path) == null) {
                path.pop();
                return null;
            }
            return path;
        }

    }

    public static void main(String[] args) {

        TreeNode node_3=new TreeNode(3);
        TreeNode node_5=new TreeNode(5);
        TreeNode node_1=new TreeNode(1);
        TreeNode node_6=new TreeNode(6);
        TreeNode node_2=new TreeNode(2);
        TreeNode node_0=new TreeNode(0);
        TreeNode node_8=new TreeNode(8);
        TreeNode node_7=new TreeNode(7);
        TreeNode node_4=new TreeNode(4);
        node_3.left=node_5;
        node_3.right=node_1;
        node_5.left=node_6;
        node_5.right=node_2;
        node_2.left=node_7;
        node_2.right=node_4;
        node_1.left=node_0;
        node_1.right=node_8;
//        Stack<TreeNode> result=getpath(node_3,node_5,new Stack<TreeNode>());
//        for (int i = 0; i <result.size() ; i++) {
//            System.out.println(result.get(i).val);
//        }
//
//        Stack<TreeNode> result2=getpath(node_3,node_1,new Stack<TreeNode>());
//        for (int i = 0; i <result2.size() ; i++) {
//            System.out.println(result2.get(i).val);
//        }
        //System.out.println(result2.size());

     System.out.println(lowestCommonAncestor(node_3,node_5,node_1).val);

    }
}
