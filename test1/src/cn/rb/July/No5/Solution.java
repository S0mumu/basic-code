package cn.rb.July.No5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public String compress (String str) {
        String res="";
        StringBuilder temp= new StringBuilder();
        Stack<Character> myStack= new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                res+=str.charAt(i);
            }else {
                while (true) {
                    myStack.push(str.charAt(i));
                    if (myStack.peek() == ']') {
                        myStack.pop();//]
                        StringBuilder s= new StringBuilder();
                        while (myStack.peek() != '|') {
                            s.append(myStack.pop());
                        }
                        StringBuilder temp2=new StringBuilder();
                        temp2.append(s.reverse().toString()).append(temp.toString());
                        temp=temp2;
                        myStack.pop();//|
                        int l = 1;
                        int count = 0;
                        while (myStack.peek() != '[') {
                            count += l * (myStack.pop()-'0');
                            l *= 10;
                        }
                        String ss="";
                        for (int j = 0; j < count; j++) {
                            ss+=temp.toString();
                        }
                        temp=new StringBuilder(ss);
                        myStack.pop();//[
                    }

                    if (myStack.isEmpty()) {
                        res += temp.toString();
                        temp = new StringBuilder();
                        break;
                    }
                    i++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.compress("BHCJSBCSCW[100|DASKDNKJWDNWCNQWCNOQCNQWOICNWQOINCWQOICNQWOIXWOISWIODAOWPQWDMQKOQZCDWF]WQJDWQUINCQQW[99|SDWQJCIQIUWCNQUCNWQIDNWQUIFNSALQP]DQOJOIXZALPPQQAAX"));

    }
}
