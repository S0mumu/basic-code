package cn.rb.May.No18;

/**
 * @author ：rb
 * @version:
 */
public class solution2 {
    public String longestPalindrome(String s){
        if(s.length()<2)
            return s;
        boolean [][] dp=new boolean[s.length()][s.length()];
        int maxlen=1;
        int start=0;
        //子串长度为1
        for (int i = 0; i <s.length() ; i++) {
            dp[i][i]=true;
        }
        //遍历子串长度
        for (int l = 2; l <=s.length() ; l++) {
            for (int i = 0;i <=s.length()-l ; i++) {
                int j=i+l-1;
                if(s.charAt(i)!=s.charAt(j)) {
                    dp[i][j] = false;
                }
                else{
                    if(l<4) {
                        dp[i][j] = true;
                    }else{
                        dp[i][j]=dp[i+1][j-1];
                    }

                }
                if(dp[i][j] && j-i+1>maxlen){
                    maxlen=j-i+1;
                    start=i;
                }
            }
        }
        return s.substring(start,start+maxlen);
    }

    public static void main(String[] args) {
        solution2 s=new solution2();
        System.out.println(s.longestPalindrome("bb"));
    }
}
