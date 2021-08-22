package cn.rb.javaBase.Super;

/**
 * @author ：rb
 * @date ：Created in 2020/11/5 下午6:50
 * @description：
 * @modified By：
 * @version:
 */
public class test {
    public static void main(String[] args) {
        superExtendsExample s1=new superExtendsExample(1,2,3);
        s1.func();
        System.out.println(""+s1.x+s1.y);
        superExample ss1=new superExample(1,2);
        System.out.println(""+ss1.x+ss1.y);
    }
}
