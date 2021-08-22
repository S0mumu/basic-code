package cn.rb.javaBase.Singleton;

/**
 * @author ：rb
 * @date ：Created in 2020/11/15 下午5:19
 * @description：java中的单例模式1懒汉式
 * @modified By：
 * @version:
 */
public class Singleton1 {
    //创建一个类内对象
    private static Singleton1 instance=null;
    //构造函数私有化
    private Singleton1(){

    }
    public Singleton1 getInstance(){
        if(instance==null){
            //要实现线程同步
            synchronized (Singleton1.class){
                if(instance==null){
                    instance=new Singleton1();
                }
            }

        }
        return instance;
    }

}
