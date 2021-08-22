package cn.rb.July.No21;
import java.util.*;
public class Main{
    public static void main(String[] args){
        TreeMap<Integer,Integer> treeMap=new TreeMap<Integer,Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        Stack<Integer> hh=new Stack<>();
        StringBuffer stringBuffer=new StringBuffer();

        Iterator<Map.Entry<Integer, Integer>> iterator = treeMap.entrySet().iterator();


//       // Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
//        while(iterator.hasNext()) {
//            Map.Entry<Integer, Integer> next = iterator.next();
//            System.out.println(next.getKey() + " " + next.getValue());
//        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(treeMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });

        for (Map.Entry<Integer,Integer> l:list) {
            System.out.println(l.getKey()+" "+l.getValue());
        }
    }
}
