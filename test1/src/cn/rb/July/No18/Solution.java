package cn.rb.July.No18;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int k=in.nextInt();
        char[][] lists=new char[n][m];
        Set<Character> myset2=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            String s=in.next().trim();
            for (int j = 0; j <m ; j++) {
                lists[i][j]=s.charAt(j);
                myset2.add(lists[i][j]);
            }
        }
        if(myset2.size()<k){
            System.out.println(-1);
        }else {

            int l1 = (int) Math.sqrt(k - 1) + 1;
            int max_l = m < n ? m : n;
            int res = -1;
            for (int i = l1; i < max_l; i++) {
                for (int s1 = 0; s1 <= n - i; s1++) {
                    for (int s2 = 0; s2 <= m - i; s2++) {
                        Set<Character> myset = new HashSet<>();
                        for (int j1 = 0; j1 < i; j1++) {
                            for (int j2 = 0; j2 < i; j2++) {
                                myset.add(lists[j1 + s1][j2 + s2]);
                            }
                        }
                        if (myset.size() >= k) {
                            res = i;
                            break;
                        }
                    }
                    if (res != -1) {
                        break;
                    }
                }
                if (res != -1) {
                    break;
                }
            }
            System.out.println(res);
        }

    }
}
