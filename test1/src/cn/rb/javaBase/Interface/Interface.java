package cn.rb.javaBase.Interface;

/**
 * @author ：rb
 * @date ：Created in 2020/11/5 下午4:45
 * @description：
 * @modified By：
 * @version:
 */
public interface Interface {
    int x=123;
    //int y; 成员是静态且final、public
    public abstract void fun1();
    default void fun2(){
        System.out.println("private function2");
    }
     default void fun3(){
        System.out.println("default fun3");
    }
    public abstract void fun5();
}
