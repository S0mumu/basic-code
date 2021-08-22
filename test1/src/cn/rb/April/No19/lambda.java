package cn.rb.April.No19;

/**
 * @author ：rb
 * @version:
 */
public class lambda {

    public static void myprint(){
        printer hh=() -> System.out.println("print.....");
        hh.print();
    }
    public static void main(String[] args){
        myprint();
    }
}
