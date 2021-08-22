package cn.rb.test1.demo09;

import java.util.ArrayList;
import java.util.Random;

public class ChengYuan extends User {
    public ChengYuan() {
    }

    public ChengYuan(String name, int money) {

        super(name, money);
    }
    public void receive(ArrayList <Integer> list){
        Random r=new Random();
        int index=r.nextInt(list.size());
        int value=list.remove(index);
        super.setMoney(super.getMoney()+value);
    }
}
