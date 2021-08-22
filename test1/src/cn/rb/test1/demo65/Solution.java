package cn.rb.test1.demo65;

/**
 * @author ：rb
 * @description: leetcode面试题第65题
 * @version:
 */
public class Solution {

        public int add(int a, int b) {
            while(b != 0) { // 当进位为 0 时跳出
                int c = (a & b) << 1;  // c = 进位
                a ^= b; // a = 非进位和，^是异或的符号
                b = c; // b = 进位
            }
            return a;
        }

    public static void main(String[] args) {
        Solution s=new Solution();
        s.add(3,-8);
    }
}
