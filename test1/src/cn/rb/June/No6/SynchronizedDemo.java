package cn.rb.June.No6;

/**
 * @author ：rb
 * @version:
 */
public class SynchronizedDemo {
    public void method(){
        synchronized (this){
            System.out.println("daiama");
        }
    }
}
