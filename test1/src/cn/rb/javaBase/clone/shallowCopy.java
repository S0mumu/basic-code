package cn.rb.javaBase.clone;

/**
 * @author ：rb
 * @date ：Created in 2020/11/4 下午7:50
 * @description：
 * @modified By：
 * @version:
 */
public class shallowCopy implements Cloneable {
    private int[] arr;
    public shallowCopy(){
        arr=new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i;
        }
    }
    public void set(int index,int value){
        arr[index]=value;
    }
    public int get(int index){
        return arr[index];
    }

    @Override
    protected shallowCopy clone() throws CloneNotSupportedException {
        return (shallowCopy) super.clone();
    }
}
