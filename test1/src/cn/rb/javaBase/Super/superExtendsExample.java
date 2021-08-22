package cn.rb.javaBase.Super;

/**
 * @author ：rb
 * @date ：Created in 2020/11/5 下午6:49
 * @description：
 * @modified By：
 * @version:
 */
public class superExtendsExample extends superExample {
    private int z;
    public superExtendsExample(int x, int y,int z) {
        super(x, y);
        this.z=z;
    }

    @Override
    public void func() {
        super.func();
        System.out.println("superExtendsExample");
    }
}
