package cn.rb.July.No24;

/**
 * @author ：rb
 * @version:
 */
public class GDMU_HYGG {
    public static int sum(int count, int remain, int total) {
        total = total / 4 * 5 + 1;
        if (count == 1) {
            return total;
        }
        if (total % 5 == 1 && total % 4 == 0) {
            count--;
        } else {
            count = 5;
            remain += 4;
            total = remain;
        }
        return sum(count, remain, total);
    }

    public static void main(String[] args) {
        System.out.println("海滩原有" + sum(5, 4, 4) + "个桃子");
    }
}
