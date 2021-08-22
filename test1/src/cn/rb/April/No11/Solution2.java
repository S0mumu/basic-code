package cn.rb.April.No11;

/**
 * @author ：rb
 * @version:
 */
public class Solution2 {
    //二叉排序树进行中序遍历
    int ans;
    int pre;
    public int minDiffInBST(TreeNode root) {
        if(root==null)
            return -1;
        ans=Integer.MAX_VALUE;
        pre=-1;
        dfs(root);
        return ans;
    }
    public void dfs(TreeNode root){
        //  左
        if(root.left!=null){
            dfs(root.left);
        }
        //  中
        if(pre==-1){
            pre=root.val;
        }else{
            ans=(ans>(root.val-pre))?(root.val-pre):ans;
            pre=root.val;
        }
        //  右
        if(root.right!=null){
            dfs(root.right);
        }
    }

    public static void main(String[] args) {

    }

}
