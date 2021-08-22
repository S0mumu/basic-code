package cn.rb.May.No5;

import java.io.*;

/**
 * @author ：rb
 * @version:
 */

class Person implements Serializable{
    public static final long serialVersionUID=42L;
    private String name;
     int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "name="+name+",age="+age;
    }
}
public class xuLieHua {

    public static void main(String[] args) {
        fanxuliehua();

    }

    public static void xuliehua() {
        File f = new File("SerialTest.txt");
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(new Person("jj", 24));
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fanxuliehua(){
        File f=new File("SerialTest.txt");
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
            Person o = (Person)ois.readObject();
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
