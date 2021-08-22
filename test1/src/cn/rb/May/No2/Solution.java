package cn.rb.May.No2;

/**
 * @author ：rb
 * @version:
 */

class Node{
    public int val;
    public Node left;
    public Node right;
    public Node(){

    }
    public Node(int _val){
        val=_val;
    }
    public Node(int _val,Node _left,Node _right){
        val=_val;
        left=_left;
        right=_right;
    }
}
public class Solution {
    private Node start;
    private Node end;
    private Node p1;
    private Node p2;
    private Node head;

    public Node treeToDoublyList(Node root){
        if(root==null)
            return null;
        search(root);
        end=p2;
        start.left=end;
        end.right=start;
        head=start;
        return head;
    }

    public void search(Node root){

        if(root.left!=null)
            search(root.left);
        p1=p2;
        p2=root;
        //叶子节点
        if(p1!=null)
            p2.left=p1;
        if(p1!=null && (p1.left==null || p1.right==null)){
            //p1指向叶子节点
            if(p2!=null)
                p1.right=p2;
            else{
                end=p1;
            }
        }
        if(p2!=null && (p2.left==null || p2.right==null)){
            //p2指向叶子节点
            if(p1!=null){
                p2.left=p1;
            }else{
                start=p2;
            }
        }
        if(root.right!=null)
            search(root.right);



    }

    public static void main(String[] args) {
        Solution s=new Solution();
        Node n4=new Node(4);
        n4.left=new Node(2);
        n4.right=new Node(5);
        n4.left.left=new Node(1);
        n4.left.right=new Node(3);
        s.treeToDoublyList(n4);
    }
}
