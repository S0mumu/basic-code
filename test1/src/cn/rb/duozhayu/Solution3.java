package cn.rb.duozhayu;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author ：rb
 * @version:
 */
public class Solution3 {
    public static int max_consistent_book_size(int[][] books){
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        for (int i = 0; i <books.length ; i++) {
            ArrayList<Integer> temp=new ArrayList<>();
            for (int j = 0; j <books[0].length ; j++) {
                temp.add(books[i][j]);
            }
        }
        Collections.sort(lists, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if(!o1.get(0).equals(o2.get(0))){
                    return o1.get(0)-o2.get(0);
                }else{
                    return o1.get(1)-o2.get(1);
                }

            }
        });

        int res=0;
        for (int i = 0; i <lists.size()-1 ; i++) {
            for (int j = 0; j <lists.get(0).size() ; j++) {
                if(lists.get(i+1).get(0)>=lists.get(i).get(0) &&
                    lists.get(i+1).get(1)>=lists.get(i).get(1)){
                    res++;
                }else{
                    int k=i+2;
                    while(k<=lists.size()){
                        if (lists.get(k).get(1)>=lists.get(i).get(1)){
                            res++;
                            break;
                        }
                        k++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] temp=new int[][]{{20210426, 20210504},
                {20210425, 20210501}, {20210427, 20210504}, {20210427, 20210502}};
       // System.out.println(max_consistent_book_size(temp));

    }
}
