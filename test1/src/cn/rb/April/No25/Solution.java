package cn.rb.April.No25;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class Solution {

    List<List<Integer>> res;
    List<Integer> path;
    public List<List<Integer>> pathSum(TreeNode root, int target) {

        if(root==null)
            return new ArrayList<>();
        res=new ArrayList<>();
        path=new ArrayList<>();

        System.out.println(res.hashCode());
        search(root,target);
        System.out.println(res);

        return res;
    }
    public void search(TreeNode root,int target){
//        if(root==null && target==0) {
//            res.add(path);
//            target+=path.remove(path.size()-1);
//            return;
//        }
//        if(root==null && target!=0){
//            target+=path.remove(path.size()-1);
//            return ;
//        }
        path.add(root.val);
        target-=root.val;
        if(root.left!=null) {
            search(root.left, target);
        }
        if(root.right!=null) {
            search( root.right, target);
        }
        if(root.left==null && root.right==null){
            if(target==0){
                List<Integer> hh=new ArrayList<>();
                for (int i = 0; i <path.size() ; i++) {
                    hh.add(new Integer(path.get(i)));
                }
                res.add(hh);
            }

        }
        target+=path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(4);
        root.left.left=new TreeNode(11);
        root.left.left.left=new TreeNode(7);
        root.left.left.right=new TreeNode(2);
        root.right=new TreeNode(8);
        root.right.left=new TreeNode(13);
        root.right.right=new TreeNode(4);
        root.right.right.left=new TreeNode(5);
        root.right.right.right=new TreeNode(1);
        s.pathSum(root,22);
    }

}
