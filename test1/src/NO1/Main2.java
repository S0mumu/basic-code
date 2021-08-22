package NO1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author ：rb
 * @version:
 */
class Node{
    int val;
    Node left;
    Node right;
    public Node(int v){
       val=v;
    }
}

public class Main2 {
    public Node build(Integer[] list){
        Node root=new Node(list[0]);
        Queue<Node> myQueue=new LinkedList<>();
        Queue<Node> tempQueue=new LinkedList<>();
        myQueue.add(root);
        int index=1;
        while(!myQueue.isEmpty() && index<list.length) {
            while (!myQueue.isEmpty() && index < list.length) {
                Node temp = myQueue.peek();
//            if(temp==null){
//                myQueue.poll();
//
//            }
                if (list[index] == null) {
                    temp.left = null;
                } else {
                    temp.left = new Node(list[index]);
                    tempQueue.add(temp.left);

                }
                index++;
                if (index < list.length) {
                    if (list[index] == null) {
                        temp.right = null;
                    } else {
                        temp.right = new Node(list[index]);
                        tempQueue.add(temp.right);
                    }
                }
                index++;
                myQueue.poll();

            }
            myQueue = tempQueue;
        }
        return root;
    }
    public void search(Node root){
        if(root==null){
            return ;
        }
        search(root.left);
        System.out.println(root.val);
        search(root.right);
    }
    public static void main(String[] args) {
        Main2 main2=new Main2();
        Integer[] list=new Integer[]{1,2,3,null,null,4,5};
        Node root=main2.build(list);
        main2.search(root);
    }

}
