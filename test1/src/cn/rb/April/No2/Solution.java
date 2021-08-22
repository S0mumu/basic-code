package cn.rb.April.No2;

import java.util.Stack;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public boolean validateStackSequences(int[] pushed,int[] popped){
        if((pushed==null && popped==null)|| (pushed.length==0 && popped.length==0))
            return true;
        if(pushed==null || popped==null||pushed.length==0||popped.length==0||
                pushed.length!=popped.length)
            return false;
        Stack<Integer> myStack =new Stack<>();
        int i=0;
        for (int j = 0; j <pushed.length ; j++) {
            myStack.push(pushed[j]);
            while(!myStack.isEmpty()&& myStack.peek()==popped[i]){
                myStack.pop();
                i++;
            }
        }
        return myStack.isEmpty();
    }

}
