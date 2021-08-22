package cn.rb.July.No2;

import java.util.*;

public class Solution{
    public static void main(String[] args) {

        Map<Integer,String> myMap=new HashMap<>();
        myMap.put(1,"hh");
        myMap.put(2,"kk");
        myMap.put(3,"ll");
        Iterator<Map.Entry<Integer,String>> iterator=myMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        Set<Map.Entry<Integer, String>> entries = myMap.entrySet();
        for (Map.Entry<Integer,String> entry: myMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        myMap.forEach((key,value)->{
            System.out.println(key);
            System.out.println(value);
        });

        myMap.entrySet().stream().forEach((entry)->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });

        myMap.entrySet().parallelStream().forEach((entry)->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }
}
