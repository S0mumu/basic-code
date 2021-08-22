package cn.rb.javaBase.Interface;

/**
 * @author ：rb
 * @date ：Created in 2020/11/5 下午5:01
 * @description：
 * @modified By：
 * @version:
 */
public class test {
    public static void main(String[] args) {
        Interface i1=new InterfaceImpl();
        i1.fun1();
        i1.fun3();
        i1.fun2();
        System.out.println(i1.x);
    }
}
