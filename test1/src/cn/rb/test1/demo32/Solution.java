package cn.rb.test1.demo32;

public class Solution {
    int k,res;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;
    }
    public void dfs(TreeNode myTree){
        if(myTree == null || k==0)
            return ;
        dfs(myTree.right);
        if(k==0)
            return ;
        k--;
        if(k==0)
            res=myTree.val;
        dfs(myTree.left);
    }




}
