package cn.rb.javaBase.superClass;

/**
 * @author ：rb
 * @date ：Created in 2020/11/5 下午7:02
 * @description：
 * @modified By：
 * @version:
 */
public class A {
    public void show(A obj){
        System.out.println("A.show(A)");
    }
    public void show(C obj){
        System.out.println("A.show(C)");
    }
}
