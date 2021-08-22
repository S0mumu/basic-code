package cn.rb.July.No12;

/**
 * @author ：rb
 * @version:
 */
class Solution {

        /**
         *
         * @param str string字符串 the string
         * @return string字符串
         */
        public String changespaceto20 (String str) {
            // write code here
            StringBuilder stringBuilder=new StringBuilder();
            for (int i = 0; i <str.length() ; i++) {
               // System.out.println(str.charAt(i));
                if(str.charAt(i)==' '){
                    stringBuilder.append("%20");
                }else{
                    stringBuilder.append(str.charAt(i));
                }
            }
            return stringBuilder.toString();
        }


    public static void main(String[] args) {
            Solution s=new Solution();
        System.out.println(s.changespaceto20(new String("a  b    c")));

    }
}
