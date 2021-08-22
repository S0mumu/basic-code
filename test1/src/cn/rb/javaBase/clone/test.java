package cn.rb.javaBase.clone;

/**
 * @author ：rb
 * @date ：Created in 2020/11/4 下午7:54
 * @description：
 * @modified By：
 * @version:
 */


public class test {
    public static void main(String[] args) {

        /**
        shallowCopy s1=new shallowCopy();
        shallowCopy s2=null;
        try {
            s2=s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        s1.set(2,222);
        System.out.println(s2.get(2));
         **/

        /**
        deepCopy d1=new deepCopy();
        deepCopy d2=null;
        try {
            d2=d1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        d1.set(2,222);
        System.out.println(d2.get(2));
         **/
        cloneConstructor c1=new cloneConstructor();
        cloneConstructor c2=new cloneConstructor(c1);
        c1.set(2,222);
        System.out.println(c2.get(2));
    }

}
