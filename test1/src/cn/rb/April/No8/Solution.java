package cn.rb.April.No8;

/**
 * @author ：rb
 * @version:
 */
public class Solution {
    public int findTheWinner(int n, int k) {
        int[] current=new int[n];
        for(int i=0;i<n;i++){
            current[i]=0;
        }
        int temp=-1;// 开始位置
        for(int i=0;i<n-1;i++){//要进行n-1次
            for(int j=0;j<k;j++){//移动k次

                while(current[(temp+1)%n]==1){
                    temp=(temp+1)%n;
                }
                //找到了temp
                temp=(temp+1)%n;
            }
            current[temp]=1;
        }

        int res;
        for(res=0;res<n;res++){
            if(current[res]==0){
                break;
            }
        }
        return res+1;

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.findTheWinner(5,2));
    }
}
