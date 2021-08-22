package cn.rb.July.No9;

import java.util.Stack;

/**
 * @author ：rb
 * @version:
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution2 {
    int count;
    TreeNode KthNode(TreeNode pRoot, int k) {
        count=k;
        Stack<TreeNode> myStack=new Stack<>();
        myStack.push(pRoot);
        while(!myStack.isEmpty()){
            while(pRoot.left!=null){
                myStack.push(pRoot.left);
                pRoot=pRoot.left;
            }
            TreeNode temp=myStack.pop();
            if(temp.right!=null){
                myStack.push(temp.right);
            }
            if(count==1){
                return temp;
            }else{
                count--;
            }
        }
        return null;
    }

}
