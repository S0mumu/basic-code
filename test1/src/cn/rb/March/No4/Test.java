package cn.rb.March.No4;

/**
 * @author ：rb
 * @version:
 */
class Person{
    String name="no name";
    public Person(String nm){
        name=nm;
    }
}
class Employee extends Person{
    String empID="000";
    public Employee(String id){
        super("");
        empID=id;
    }
}
public class Test {
    public static void main(String[] args) {
        Employee e=new Employee("fd");
        System.out.println(e.empID);
    }
}
