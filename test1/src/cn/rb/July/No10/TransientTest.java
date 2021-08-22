package cn.rb.July.No10;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ：rb
 * @version:
 */
public class TransientTest {
    public static void main(String[] args){

        int[] hh={1,2,3};
        //List list = new ArrayList<>(Arrays.asList(hh));
        List list=Arrays.stream(hh).boxed().collect(Collectors.toList());
        for (Object a:list) {
            System.out.println((int)a);
        }
        System.out.println(list.toString());
        String string1="fgkhj";
        System.out.println(string1.hashCode());
        string1="dg";
        String string2=new String("dg");
        System.out.println(string2.hashCode());
        System.out.println(string1.hashCode());
        System.out.println("string1==string2?"+(string1==string2));
        Integer int1=1000;
        Integer int2=1000;
        System.out.println(int1==int2);
        System.out.println(42==42.0);
        User user=new User();
        user.setUsername("jh");
        user.setPassword("k");


        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(
                    new FileOutputStream("/Users/rb/Desktop/1.txt"));
            objectOutputStream.writeObject(user);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(
                    new FileInputStream("/Users/rb/Desktop/1.txt"));

            User user1 = (User) objectInputStream.readObject();
            System.out.println(user1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class User implements Serializable{


    private static final long serialVersionUID = 4490677774994687782L;
    private String username;
    private transient String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
