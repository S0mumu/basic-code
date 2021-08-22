package cn.rb.javaBase.Singleton;

/**
 * @author ：rb
 * @date ：Created in 2020/11/15 下午7:15
 * @description：java单例模式3静态内部类的实现
 * @modified By：
 * @version:
 */
public class Singleton3 {
    private static class SingletonHolder{
        private static Singleton3 instance=new Singleton3();
    }
    private Singleton3(){

    }
    public Singleton3 getInstance(){
        return SingletonHolder.instance;
    }
}
