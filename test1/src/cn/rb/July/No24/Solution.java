package cn.rb.July.No24;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    private static int count;
    private static int num;
    public static int getSearch(int i){
        if (i==0){
            return 1;
        }
        if((num-1)%5!=0){
            return -1;
        }
        num=(num-1)/5*4;
        return getSearch(i-1);

    }
    public static void main(String[] args) {
        for (int i = 0; i <10000 ; i++) {
            count=5;
            num=i;
            if(getSearch(count)==1){
                System.out.println("桃子有"+i+"个");
                break;
            }
        }
    }
}
