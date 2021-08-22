package cn.rb.test1.demo09;

import java.util.ArrayList;

public class QunZhu extends User {
    public QunZhu() {
    }

    public QunZhu(String name, int money) {

        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList=new ArrayList<>();
        int leftMoney= super.getMoney();
        if(leftMoney<totalMoney){
            System.out.println("余额不足");
            return redList;
        }
        super.setMoney(leftMoney-totalMoney);
        int avg=totalMoney/count;
        int mod=totalMoney%count;
        for (int i = 0; i <count-1 ; i++) {
            redList.add(avg);
        }
        redList.add(avg+mod);
        return redList;
    }
}
