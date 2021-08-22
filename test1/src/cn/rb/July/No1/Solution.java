package cn.rb.July.No1;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    int count=0;
    int[][] hh;
    public int movingCount(int m,int n,int k){
        int i=0;
        int j=0;
        hh=new int[m][n];
        search(i,j,m,n,k);
        return count;
    }
    public void search(int p,int q,int m,int n,int k){
        if(p>=0&& p<m && q>=0 && q<n && hh[p][q]==0 &&  p / 10 + p % 10 + q / 10 + q % 10<=k ){
            count++;
            hh[p][q]=1;
            search(p-1,q,m,n,k);
            search(p+1,q,m,n,k);
            search(p,q-1,m,n,k);
            search(p,q+1,m,n,k);
        }
    }
    public int cal(int number){
        int re=0;
        while(number!=0){
            re+=number%10;
            number=number/10;

        }
        return re;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.cal(99));
    }

}
