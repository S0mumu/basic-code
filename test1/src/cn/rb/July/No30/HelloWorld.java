package cn.rb.July.No30;

public class HelloWorld {
    String str=new String("good");
    char[] ch={'a','b','c'};
    public  int b;
    public static void main(String []args) {
        HelloWorld k=new HelloWorld();
        k.change(k.str,k.ch);
        System.out.println(k.str);
        System.out.println(k.ch);
        //int t=b;
    }
    public void change(String str,char ch[]){
        str="test";
        ch[0]='g';
    }

}