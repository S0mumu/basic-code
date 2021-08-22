package cn.rb.July.No9;

/**
 * @author ：rb
 * @version:
 */



public class Solution {
    TreeNode val;
    int count;
    TreeNode KthNode(TreeNode pRoot, int k) {
        count=k;
        search(pRoot);
        return val;
    }

    public void search(TreeNode pRoot){
        if(pRoot==null || count<=0){
            return ;
        }
        search(pRoot.left);
        System.out.println(pRoot.val+""+count);
        if(count==1){
            val=pRoot;
            count--;
            return ;
        }
        count--;
        search(pRoot.right);
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        TreeNode node_5=new TreeNode(5);
        TreeNode node_3=new TreeNode(3);
        TreeNode node_7=new TreeNode(7);
        TreeNode node_2=new TreeNode(2);
        TreeNode node_4=new TreeNode(4);
        node_5.left=node_3;
        node_5.right=node_7;
        node_3.right=node_4;
        node_3.left=node_2;
        System.out.println(s.KthNode(node_5,3).val);
    }

}
