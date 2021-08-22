package cn.rb.March.No5;

import apple.laf.JRSUIUtils;

import java.util.Arrays;

/**
 * @author ：rb
 * @version: 根据树的前序和中序来遍历一棵树
 */
public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || preorder.length == 0 || preorder.length != inorder.length)
            return null;
        TreeNode node = new TreeNode();
        return build(node, 0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder);

    }

    public TreeNode build(TreeNode node, int pre_start, int pre_end, int in_start, int in_end, int[] preorder, int[] inorder) {
        if (pre_start > pre_end || in_start > in_end)
            return null;
        //从前序队列中取一个数
        node.val = preorder[pre_start];
        int temp = 0;//存储的是在inorder中数的中间节点所在的位置，这就可以把节点分到左、右子数
        for (int i = in_start; i <= in_end; i++) {
            if (inorder[i] == preorder[pre_start]) {
                temp = i;
                break;
            }
        }
        TreeNode node_left = new TreeNode();

        node.left = build(node_left, pre_start + 1, pre_start + temp - in_start, in_start, temp - 1, preorder, inorder);
        TreeNode node_right = new TreeNode();
        node.right = build(node_right, pre_start + temp - in_start + 1, pre_end, temp + 1, in_end, preorder, inorder);
        return node;
    }

}
