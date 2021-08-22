package cn.rb.April.No24;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null || postorder.length==0)
            return true;
        int root = postorder[postorder.length - 1];
        int count = -1;//右子树开始的位置
        for (int i = 0; i < postorder.length; i++) {
            if (root < postorder[i]) {
                count = i;
                break;
            }
        }
        //左子树0-count-1
        int[] right;
        int[] left;
        if (count == -1) {

            //没有右子树
            right= new int[0];
            left =new int[postorder.length-1];
            for (int i = 0; i <postorder.length-1 ; i++) {
                left[i]=postorder[i];
            }
        }else {

            right = new int[postorder.length - 1 - count];
            // 表明有子树
            for (int i = count, j = 0; i < postorder.length-1; i++, j++) {
                if (postorder[i] < root)
                    return false;
                right[j] = postorder[i];
            }


            if (count == 0) {
                left = new int[0];

            } else {
                left = new int[count];
                for (int i = 0; i < count; i++) {
                    if (postorder[i] > root)
                        return false;
                    left[i] = postorder[i];
                }
            }
        }
        if (verifyPostorder(right) && verifyPostorder(left))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Integer a=0;
        System.out.println(a instanceof Object);
        Solution s=new Solution();
        System.out.println(s.verifyPostorder(new int[]{4, 8, 6, 12, 16, 14, 10}));
    }
}
