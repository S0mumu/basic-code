package cn.rb.test1.demo08;

public class Student {
    static{
        System.out.println("kaishi");//静态代码块先执行，只执行一次
        //静态代码块：一次性对静态成员变量进行赋值
    }
    private String name;
    private int age;
    static String room;
    private static int id;
    private static int idCounter=0;

    public Student() {
        this.id=++idCounter;
    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
        this.id=++idCounter;
    }
                  
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        
        Student.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
