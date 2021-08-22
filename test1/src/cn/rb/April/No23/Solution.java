package cn.rb.April.No23;

import java.util.*;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> myQueue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        myQueue.add(root);
        int flag = 1;
        while (!myQueue.isEmpty()) {
            Queue<TreeNode> que = new LinkedList<>();
            List<Integer> hh = new ArrayList<>();
            while (!myQueue.isEmpty()) {
                //先进先出
                TreeNode temp = myQueue.remove();
                if (temp.left != null) {
                    que.add(temp.left);
                }
                if (temp.right != null) {
                    que.add(temp.right);
                }
                hh.add(temp.val);
            }
            if(flag==-1){
                Stack<Integer> myStack=new Stack<>();
                for (int i = 0; i <hh.size() ; i++) {
                    myStack.push(hh.get(i));
                }

                for (int i = 0; i <hh.size() ; i++) {
                    hh.set(i,myStack.pop());
                }
            }
            if(!que.isEmpty()){
                myQueue = que;
            }

            res.add(hh);
            if(flag==1)
                flag = -1;
            else
                flag=1;


        }

        return res;

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        TreeNode tree=new TreeNode(3);
        tree.left=new TreeNode(9);
        tree.right=new TreeNode(20);
        tree.right.left=new TreeNode(15);
        tree.right.right=new TreeNode(7);
        List<List<Integer>> res =s.levelOrder(tree);
        System.out.println(res.toString());
    }
}
