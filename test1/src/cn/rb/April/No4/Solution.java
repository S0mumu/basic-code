package cn.rb.April.No4;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int[] levelOrder(TreeNode root){
        if(root==null)
            return null;
        Queue<TreeNode> myQueue=new LinkedList<>();
        myQueue.add(root);
        ArrayList<Integer> res=new ArrayList<>();
        while(!myQueue.isEmpty()){
            TreeNode temp=myQueue.remove();
            res.add(temp.val);
            if(temp.left!=null){
                myQueue.add(temp.left);
            }
            if(temp.right!=null){
                myQueue.add(temp.right);
            }
        }
        int[] result=new int[res.size()];
        for (int i = 0; i <res.size() ; i++) {
            result[i]=res.get(i);
        }
        return result;
    }
}
