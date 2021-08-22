package cn.rb.test1.demo07;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/*
public boolean equalsIgnoreCase()
public int length()
public String concat(String str) 拼接字符串
public char chatAt(int index)
public int indexof(String str)查找字符串在本字符串出现的首次位置,若没有返回-1
public String substring(int index)
public String substring(int begin,int end)
public char[] tocharArray() 把当前字符串变为char数组
pubilc byte[] getBytes()当前字符串的底层字节数组
public String replace(charSequence oldString,charSequence newString) 替换字符
public String[] split(String regex) 切分字符串"正则表达式"  "\\."
 */
public class demo {
    public static void main(String[] args) {
        String str="abc";
        byte []fff={'a','f'};
        String str2=new String(fff);

        String ll="kkLL";
        System.out.println("KKLL".equalsIgnoreCase(ll));
        System.out.println(ll.length());
        System.out.println("kji".concat(ll));
        System.out.println(ll.charAt(2));
        System.out.println(ll.indexOf("L"));
        System.out.println(ll.substring(2));
        System.out.println(ll.substring(1,3));
        char []fg=ll.toCharArray();
        byte []gfg=ll.getBytes();
        for (int i = 0; i < gfg.length; i++) {
            System.out.println(gfg[i]);
        }
        System.out.println(ll.replace('k','K'));
        System.out.println(ll.replace("kk" ,"KK"));
        String lo="fgkl,sfgg,fgg";
        String[] array1=lo.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;
        char [] charArray=input.toCharArray();




    }

}
