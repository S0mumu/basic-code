package cn.rb.test1.demo40;

public class Solution {
    public double[] twoSum(int n){
        double pre[]={1.0/6,1.0/6,1.0/6,1.0/6,1.0/6,1.0/6};
        for (int i = 2; i <=n ; i++) {
            double[] temp=new double[i*5+1];
            for (int j = 0; j <pre.length; j++) {
                for (int k = 0; k <6 ; k++) {
                    temp[j+k]+=pre[j]/6;
                }
            }
            pre=temp;
        }

        return pre;
    }




}
