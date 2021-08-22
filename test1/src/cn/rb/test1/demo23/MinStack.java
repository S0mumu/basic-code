package cn.rb.test1.demo23;

import java.util.*;

/*public class MinStack {

    Stack<Integer> mystack;
   // int min=(int) Double.POSITIVE_INFINITY;
    List<Integer> myorder;

    public MinStack() {
        mystack=new Stack<>();
        myorder=new ArrayList();

    }

    public void push(int x) {
        mystack.push(x);
        myorder.add(x);

    }

    public void pop() {
        if(mystack.peek()!=null)
            myorder.remove(mystack.pop());

    }

    public int top() {
        return mystack.peek();

    }

    public int min() {
        Collections.sort(myorder);
        return myorder.get(0);
    }



}*/
public class MinStack{
    //用双栈来实现min函数O(1) 的时间复杂度
    Stack<Integer> A;
    Stack<Integer> B;
    public MinStack(){
        A=new Stack<>();
        B=new Stack<>();

    }
    public void push(int x){
        A.push(x);
        if(B.empty() ||B.peek()>=x)
            B.push(x);
    }
    public void pop(){
        if(A.pop().equals(B.peek()))
            B.pop();
    }
    public int top(){
        return A.peek();

    }
    public int min(){
        return B.peek();
    }
}