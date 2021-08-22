package cn.rb.javaBase.Singleton;

/**
 * @author ：rb
 * @date ：Created in 2020/11/15 下午7:08
 * @description：Java单例模式饿汉式
 * @modified By：
 * @version:
 */
public class Singleton2 {
    //类内直接创建好了对象
    private static Singleton2 instance=new Singleton2();
    private Singleton2(){

    }
    public Singleton2 getInstance(){
        return instance;
    }
}
