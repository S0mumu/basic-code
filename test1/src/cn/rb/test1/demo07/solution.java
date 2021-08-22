package cn.rb.test1.demo07;

import apple.laf.JRSUIUtils;

import java.util.HashMap;

public class solution {
    public static void main(String[] args) {
        int [] p={3,9,20,15,7};
        int [] i={9,3,15,20,7};
        System.out.println(buildTree(p,i).val);
    }
    public static TreeNode buildTree(int[] preorder,int [] inorder){
        if(preorder==null || preorder.length==0){
            return null;
        }
        //用一个hashmap来存储inorder，来方便后续的查找
        HashMap<Integer,Integer> hhh=new HashMap<>(inorder.length);
        for (int i = 0; i <inorder.length; i++) {
            hhh.put(inorder[i],i);
        }
        return build(preorder,inorder,0,inorder.length-1,
                0,inorder.length-1,hhh);
    }
    public static  TreeNode build(int[] preorder,int[] inorder,int preorder_s,int preorder_e,
                          int inorder_s,int inorder_e,HashMap<Integer,Integer> h){
        if(preorder_s>preorder_e){
            return null;
        }
        TreeNode root=new TreeNode(preorder[preorder_s]);
        if(preorder_s==preorder_e){
            return root;
        }else{
            int rootIndex=h.get(preorder[preorder_s]);
            int num_for_left=rootIndex-inorder_s;
            int num_for_right=inorder_e-rootIndex;
            root.left=build(preorder,inorder,preorder_s+1,preorder_s+num_for_left,
                    inorder_s,rootIndex-1,h);
            root.right=build(preorder,inorder,preorder_s+num_for_left+1,preorder_e,
                    rootIndex+1,inorder_e,h);
            return root;
        }
    }

}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}