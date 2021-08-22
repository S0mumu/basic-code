package cn.rb.July.No7;

import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        Integer[] mylist=new Integer[numbers.length];
        for (int i = 0; i <numbers.length ; i++) {
            mylist[i]=numbers[i];
        }
        Arrays.sort(mylist,new Comparator<Integer>(){
            public int compare(Integer o1,Integer o2){
                String s1=o1+"";
                String s2=o2+"";
                if(s1.charAt(0)<s2.charAt(0)){
                    return -1;
                }else if(s1.charAt(0)>s2.charAt(0)){
                    return 1;
                }else{
                    int k=1;
                    while(true){
                        char ss1;
                        char ss2;
                        if(s1.length()<=k){
                            ss1=s1.charAt(0);
                        }else{
                            ss1=s1.charAt(k);
                        }
                        if(s2.length()<=k){
                            ss2=s2.charAt(0);
                        }else{
                            ss2=s2.charAt(k);
                        }
                        if(ss1<ss2){
                            return -1;
                        }else if(ss1>ss2){
                            return 1;
                        }else if(s1.length()<k && s2.length()<k && ss1==ss2 ){
                            return 0;
                        }
                        k++;
                    }
                }

            }
        });

        String s="";
        for(int i=0;i<mylist.length;i++){
            s+=mylist[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.PrintMinNumber(new int[]{1,11,111}));
    }
}
