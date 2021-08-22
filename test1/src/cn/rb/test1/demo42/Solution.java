package cn.rb.test1.demo42;

import java.util.ArrayList;

/**
 * @author ：rb
 * @date ：Created in 2020/11/2 下午12:58
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Solution {
    public int lastRemaining(int n,int m){
        ArrayList<Integer> list=new ArrayList<>(n);
        for (int i = 0; i <n ; i++) {
            list.add(i);
        }
        //创建了一个ArrayList，大小为n，每个位置存储的值与它的下标相同
        //因为要求处最后剩下的坐标，所以可以模拟这个过程，得到最后剩下的数，一共需要删除n-1次
        int index=0;
        while(n>1){
            index=(index+m-1)%n;
            list.remove(index);
            n--;
        }
        return list.get(0);

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.lastRemaining(5,3));
    }
}
