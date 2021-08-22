package cn.rb.May.No3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：rb
 * @version:
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class Codec {
    public String serialize(TreeNode root){
        if(root ==null)
            return new String();
        Queue<TreeNode> myQueue=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        myQueue.add(root);
        while(!myQueue.isEmpty() ){
            Queue<TreeNode> tempQueue=new LinkedList<>();
            while(!myQueue.isEmpty()) {
                TreeNode cur = myQueue.remove();
                if(cur!=null)
                    res.add(cur.val);
                else{
                    TreeNode h=null;
                    if (h==null && !myQueue.isEmpty()){
                        for (TreeNode hh:myQueue) {
                            if(hh!=null ){
                                h=hh;
                                res.add(null);
                                break;
                            }
                        }
                    }
                    if (h==null && !tempQueue.isEmpty() ){
                        for (TreeNode hh:tempQueue) {
                            if(hh!=null ){
                                h=hh;
                                res.add(null);
                                break;
                            }
                        }
                    }

                }
                if (cur!=null && cur.left!=null){
                    tempQueue.offer(cur.left);
                }else if(cur!=null && cur.left==null){
                    tempQueue.offer(null);

                }
                if(cur!=null && cur.right!=null){
                    tempQueue.offer(cur.right);

                }else if(cur!=null && cur.right==null){
                    tempQueue.offer(null);

                }
            }
            myQueue=tempQueue;

        }

        return res.toString();

    }
    public TreeNode deserialize(String data){
        if(data==null ||data.length()==0 )
            return null;
        data=data.substring(1,data.length()-1);
        String[] split = data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(split[0].trim()));
        Queue<TreeNode> myQueue=new LinkedList<>();
        myQueue.offer(root);
        for (int i = 1; i <split.length ; i=i+2) {
            if (!myQueue.isEmpty()) {
                TreeNode temp = myQueue.remove();
                //确定左右子树
                for (int a = 0; a < 2 && i+a<split.length; a++) {
                    if (split[i + a].trim().equals("null")) {
                        if (a == 0)
                            temp.left = null;
                        else
                            temp.right = null;
                    } else {
                        if (a == 0) {
                            TreeNode left = new TreeNode(Integer.parseInt(split[i + a].trim()));
                            temp.left = left;
                            myQueue.offer(left);
                        } else if (a == 1) {
                            TreeNode right = new TreeNode(Integer.parseInt(split[i + a].trim()));
                            temp.right = right;
                            myQueue.offer(right);
                        }

                    }
                }
            }

        }
        return root;

    }

    public static void main(String[] args) {
        Codec cc=new Codec();
        System.out.println(cc.serialize(cc.deserialize(new String("[1,6,2,7,5,null,null,8,null,6,4,7,9,null,null,3,5,null,null,10,8,4,2,null,null,9,11,null,null,1]"))));

    }
}

