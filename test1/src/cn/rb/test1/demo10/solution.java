package cn.rb.test1.demo10;

public class solution {
    public static void main(String[] args) {
        solution s=new solution();
        System.out.println(s.fib(48));
    }
    public int fib(int n){
        int [] re=new int[101];
        re[0] = 0;
        re[1]=1;
        int l=2;
        while(l<=n){
            re[l]= (int) ((re[l-1]+re[l-2])%(1e9+7));
            l++;
        }

        return re[n];
    }
}
