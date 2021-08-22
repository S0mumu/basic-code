package cn.rb.duozhayu;

import java.sql.SQLOutput;
import java.util.Stack;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public String decompress(String compressed_str){
        Stack<Character> myStack=new Stack<>();
        int flag=1;
        while(flag==1 && compressed_str.length()>0) {
            String temp = "";
            String total = "";
            for (int i = 0; i < compressed_str.length(); i++) {
                if (compressed_str.charAt(i) != ')') {
                    myStack.add(compressed_str.charAt(i));
                    if(i==compressed_str.length()-1){
                        flag=0;
                        break;
                    }
                } else {
                    int k = 0;

                    while (!myStack.isEmpty() && myStack.peek() != '(') {
                        temp = myStack.pop() + temp;
                        k++;
                    }
                    int start=i-k-1;
                    myStack.pop();
                    if(i + 1>=compressed_str.length()){
                        total=temp;
                    }else {
                        if (compressed_str.charAt(i + 1) >= '0' && compressed_str.charAt(i + 1) <= '9') {
                            for (int j = 0; j < compressed_str.charAt(i + 1) - '0'; j++) {
                                total += temp;
                            }
                            i++;

                        } else {
                            total = temp;

                        }
                    }
                    int end=i;
                    //System.out.println(start);

                        compressed_str = compressed_str.substring(0, start) + total + compressed_str.substring(end + 1);

                    //System.out.println(compressed_str);
                    break;
                }

            }
        }
        return compressed_str;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.decompress("((a)2"));
    }
}
