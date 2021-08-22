package cn.rb;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：rb
 * @version:
 */
class util{
    public static void print(String s){
        System.out.println(s);
    }
}
class Meal{
    Meal(){
        util.print("meal");
    }
}
class Bread{
    Bread(){
        util.print("bread");
    }
}
class Cheese{
    Cheese(){
        util.print("Cheese");
    }
}

class Lettuce{
    Lettuce(){
        util.print("Lettuce");
    }
}
class Lunch extends Meal{
    Lunch(){
        util.print("lunch");
    }
}

class ProtableLunch extends Lunch{
    ProtableLunch(){
        util.print("ProtableLunch");
    }
}
public class Main extends ProtableLunch {
    private Bread b=new Bread();
    private Cheese c=new Cheese();
    private Lettuce l=new Lettuce();
    private Main(){
        util.print("sandwitch");
    }
    public static void main(String[] args) {

        new Main();

    }
}
