package cn.rb.May.No21;

import java.util.*;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public List<String> letterCombinations(String digits){
        List<String> combinations=new ArrayList<>();
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(2,"abc");
        hashMap.put(3,"def");
        hashMap.put(4, "ghi");
        hashMap.put(5, "jkl");
        hashMap.put(6, "mno");
        hashMap.put(7, "pqrs");
        hashMap.put(8, "tuv");
        hashMap.put(9, "wxyz");
        search(combinations,digits,0,hashMap,new StringBuffer());
        return combinations;


    }
    public void search(List<String> combinations,String digits,int index,HashMap<Integer,String> hashMap,StringBuffer s){
        if(index==digits.length()){
            combinations.add(s.toString());
        }else{
            String letters=hashMap.get(digits.charAt(index)-'0');
            for (int i = 0; i <letters.length() ; i++) {
                s.append(letters.charAt(i));
                search(combinations,digits,index+1,hashMap,s);
                s.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println("􏼿􏾛􏻬􏻭:"); System.out.println(arrayList);
// void reverse(List list)􏺀􏲦􏰠
 Collections.reverse(arrayList); System.out.println("Collections.reverse(arrayList):"); System.out.println(arrayList);
// void sort(List list),􏼙􏺺􏽵􏼜􏸋􏶒􏼛􏸋􏼜􏸋
 Collections.sort(arrayList);
 System.out.println("Collections.sort(arrayList):");
 System.out.println(arrayList);
// 􏸇􏶪􏼜􏸋􏶒􏺄􏷠
        Collections.sort(arrayList, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            } });
        System.out.println("􏸇􏶪􏼜􏸋􏽶􏺀");
        System.out.println(arrayList);
    }
}
