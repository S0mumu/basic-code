package cn.rb.Auguest.No4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        while(in.hasNext()) {
            long num1 = in.nextLong();
            ArrayList<Long> arrayList = new ArrayList<>();
            if (num1 > 0) {
                for (long i = 0; i < num1; i++) {
                    arrayList.add(in.nextLong());
                }
            }
            long num2 = in.nextLong();
            ArrayList<Long> arrayList2 = new ArrayList<>();
            if (num2 > 0) {
                for (long i = 0; i < num2; i++) {
                    arrayList2.add(in.nextLong());
                }
            }
            if (num1 > 0 && num2 > 0) {
                arrayList2.sort(new Comparator<Long>() {
                    @Override
                    public int compare(Long o1, Long o2) {
                        if (o1 < o2) {
                            return -1;
                        } else if (o1 > o2) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                });
                ArrayList<ArrayList<String>> res = new ArrayList<>();
                ArrayList<String> title = new ArrayList<>();
                long before = -1;
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (arrayList2.get(i) != before) {
                        String temp = arrayList2.get(i) + "";
                        ArrayList<String> tempresult = new ArrayList<>();

                        for (int j = 0; j < arrayList.size(); j++) {
                            String temp2 = arrayList.get(j) + "";
                            if (temp2.contains(temp)) {
                                tempresult.add(j + "");
                                tempresult.add(arrayList.get(j) + "");
                            }
                        }
                        if (tempresult.size() > 1) {
                            res.add(tempresult);
                            title.add(temp);
                        }
                    }
                    before = arrayList2.get(i);
                }
                int totalsize = title.size() * 2;
                for (int i = 0; i < res.size(); i++) {
                    totalsize += res.get(i).size();
                }
                String s = totalsize + " ";
                for (int i = 0; i < res.size(); i++) {
                    s += title.get(i) + " ";
                    s += (res.get(i).size()) / 2 + " ";
                    for (int j = 0; j < res.get(i).size(); j++) {
                        s += res.get(i).get(j) + " ";
                    }
                }
                System.out.println(s.trim());
            } else {
                System.out.println("");
            }

        }
    }

}
