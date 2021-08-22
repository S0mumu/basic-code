package cn.rb.test1.demo33;


import java.util.LinkedList;
import java.util.List;

public class Solution {
    /*
    public int maxDepth(TreeNode root){
        return searchTree(root);
    }
    //DFS
    public int searchTree(TreeNode root){
        if(root==null)
            return 0;
        if(searchTree(root.left)>=searchTree(root.right))
            return searchTree(root.left)+1;
        return searchTree(root.right)+1;
      //  return Math.max(searchTree(root.left), searchTree(root.right)) + 1;
    }
     */
    public int maxDepth(TreeNode root){
        if(root==null)
            return 0;
        List<TreeNode> queue=new LinkedList<TreeNode>(){{add(root);}},tmp;
        int res=0;
        while (!queue.isEmpty()){
            tmp=new LinkedList<>();
            for (TreeNode tempNode: queue) {
                if(tempNode.left!=null){
                    tmp.add(tempNode.left);
                }
                if(tempNode.right!=null){
                    tmp.add(tempNode.right);
                }
            }
            queue=tmp;
            res++;
        }
        return res;
    }
}
