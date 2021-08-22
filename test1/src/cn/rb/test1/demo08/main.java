package cn.rb.test1.demo08;

public class main {
    public static void main(String[] args) {
        Student s1=new Student("gu",19);
        Student.room="01";//静态方法用类.变量名
        System.out.println(s1.getName()+s1.getAge()+s1.getId()+s1.room);
        Student s2=new Student("huang" ,16);
        System.out.println(s2.getName()+s2.getAge()+s2.getId()+s2.room);


    }

}
class MyMethods{
    //静态方法属于类
    //没有staic方法，要创建对象后才能调用方法
    //有static 方法直接类.方法
    public static void method1(){
        System.out.println("jingtai");
    }
    public void method2(){
        method1();//对于本类方法可以省略类名称
        System.out.println("chengyuan ");
    }
}
