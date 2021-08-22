package cn.rb.test1.demo24;

import java.util.*;

public class Solution {

    //学到了queue.size()可以用于求queue队列中元素的数量
    public List<List<Integer>> levelOrder(TreeNode root){
        if(root==null)
            return new ArrayList<>(0);
        Queue<TreeNode> myQueue=new LinkedList<>();
        myQueue.offer(root);
        List<List<Integer>> myResult=new ArrayList<>();
        List<Integer> current;
        while(!myQueue.isEmpty()){
            current=new ArrayList<>();
            int len=myQueue.size();
            for (int i = 0; i <len; i++) {
                TreeNode temp=myQueue.poll();
                current.add(temp.val);
                if(temp.left!=null)
                    myQueue.offer(temp.left);
                if(temp.right!=null)
                    myQueue.offer(temp.right);
            }
            myResult.add(current);
        }
        return myResult;
    }


}
