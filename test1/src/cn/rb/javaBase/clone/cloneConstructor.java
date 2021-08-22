package cn.rb.javaBase.clone;

/**
 * @author ：rb
 * @date ：Created in 2020/11/4 下午8:07
 * @description：
 * @modified By：
 * @version:
 */
public class cloneConstructor {
    private int[] arr;
    public cloneConstructor(){
        arr=new int[10];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i;
        }
    }
    public cloneConstructor(cloneConstructor original){
        arr=new int[original.arr.length];
        for (int i = 0; i <original.arr.length ; i++) {
            arr[i]=original.arr[i];
        }
    }
    public void set(int index,int value){
        arr[index]=value;
    }
    public int get(int index){
        return arr[index];
    }
}
