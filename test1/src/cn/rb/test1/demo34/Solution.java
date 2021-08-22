package cn.rb.test1.demo34;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public boolean isBalanced(TreeNode root){
        if(root==null||(root.right==null&& root.left==null))
            return true;
        int leftDepth,rightDepth;
        if(isBalanced(root.left)&& isBalanced(root.right)&& Math.abs(bfs(root.left)-bfs(root.right))<=1 )
            return true;
        return false;

    }
    public int bfs(TreeNode root){
        //用于搜索树的深度
        if(root==null)
            return 0;
        List<TreeNode> queue= new LinkedList<TreeNode>(){{add(root);}};
        List<TreeNode> temp;
        int depth=0;
        while(!queue.isEmpty()){
            temp=new LinkedList<>();
            for (TreeNode node:queue) {
                queue.remove(node);
                if(node.left!=null)
                    temp.add(node.left);
                if(node.right!=null)
                    temp.add(node.right);
            }
            depth++;
            queue=temp;
        }
        return depth;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.bfs(new TreeNode(2)));
    }

}
