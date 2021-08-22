package cn.rb.June.No22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public List<Integer> grayCode(int n){
        List<Integer> res=new ArrayList<>();
        res.add(0);
        int head=1;
        for (int i = 0; i <n ; i++) {
            for (int j = res.size()-1; j >=0 ; j--) {
                res.add(head+res.get(j));
            }
            head<<=1;
        }
        return res;

    }
}
