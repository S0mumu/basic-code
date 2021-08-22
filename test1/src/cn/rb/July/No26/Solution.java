package cn.rb.July.No26;

import java.util.Scanner;

/**
 * @author ：rb
 * @version:
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
public class Solution {
    public static void main(String[] args) {
        String s=";";
        String[] s1 = s.split(" ");
       // s1[0].length()

        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i <t ; i++) {
            int n=scanner.nextInt();
            int[] list=new int[n];

            for (int j = 0; j <n ; j++) {
                list[j]=scanner.nextInt();
            }

            TreeNode root=new TreeNode();
            root.val=list[0];
            //构建二叉排序树
            for (int j = 1; j <n ; j++) {
                addNode(root,list[j]);
            }

            //计算左支的长度
            TreeNode temp=root;
            int len_left=0;
            while(temp!=null){
                len_left++;
                temp=temp.left;
            }

            temp=root;
            int len_right=0;
            while(temp!=null){
                len_right++;
                temp=temp.right;
            }

            int min=Math.min(11,n/2);
            if(min>=Math.abs(len_left-len_right)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
    }

    public  static  void addNode(TreeNode root, int j){
        if(root.val<j){
            if(root.right==null){
                root.right=new TreeNode();
                root.right.val=j;
                return ;
            }else{
                addNode(root.right,j);
            }

        }else{
            if(root.left==null){
                root.left=new TreeNode();
                root.left.val=j;
                return;
            }else {
                addNode(root.left, j);
            }
        }
    }
}
