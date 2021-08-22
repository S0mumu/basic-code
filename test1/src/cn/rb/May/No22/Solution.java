package cn.rb.May.No22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public List<String> letterCombinations(String digits){
        if(digits==null || digits.trim().length()==0)
            return new ArrayList<>();
        List<String> res=new ArrayList<>();
        digits=digits.trim();
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(2,"abc");
        hashMap.put(3,"def");
        hashMap.put(4,"ghi");
        hashMap.put(5,"jkl");
        hashMap.put(6,"mno");
        hashMap.put(7,"pqrs");
        hashMap.put(8,"tuv");
        hashMap.put(9,"wxyz");
        search(digits,res,hashMap,0,new StringBuffer());
        return res;
    }
    public void search(String digits,List<String> res,HashMap<Integer,String> hh,int index,StringBuffer cur){
        if(index==digits.length()){
            res.add(cur.toString());
        }else{
            String temp=hh.get(digits.charAt(index)-'0');
            for (int i = 0; i <temp.length() ; i++) {
                cur.append(temp.charAt(i));
                search(digits,res,hh,index+1,cur);
                cur.delete(cur.length()-1,cur.length());
            }
        }
    }
}
