package cn.rb.javaBase.clone;

/**
 * @author ：rb
 * @date ：Created in 2020/11/4 下午7:57
 * @description：
 * @modified By：
 * @version:
 */
public class deepCopy implements Cloneable {
    private int[] arr;
    public deepCopy(){
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
    protected deepCopy clone() throws CloneNotSupportedException {
        deepCopy result=(deepCopy) super.clone();
        result.arr=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            result.arr[i]=arr[i];
        }
        return result;
    }
}
