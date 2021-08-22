package cn.rb.July.No13;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public String reverseWords(String s){
        String[] s1 = s.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <s1.length ; i++) {
            if(i!=0){
                stringBuilder.append(" ");
            }
            for (int j = s1[i].length()-1; j >=0 ; j--) {
                stringBuilder.append(s1[i].charAt(j));
            }
        }
        return stringBuilder.toString();
    }
}
