package cn.rb.June.No12;

/**
 * @author ：rb
 * @version:
 */
public class Solution {

    public boolean exist(char[][] board,String word){

        if(board==null){
            return false;
        }

        int[][] visited;
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                visited=new int[board.length][board[0].length];
                if(search(board,visited,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean search(char[][] board,int[][] visited,String word,int index,int x,int y){
        if(index>=word.length()){
            return true;
        }

        if(x<0||y<0||x>=board.length ||y>=board[0].length || visited[x][y]==1 || word.charAt(index)!=board[x][y]){
            return false;
        }
            visited[x][y]=1;
            index++;
            //向上走
            boolean h1=search(board,visited,word,index,x-1,y);
            boolean h2=search(board,visited,word,index,x+1,y);
            boolean h3=search(board,visited,word,index,x,y-1);
            boolean h4=search(board,visited,word,index,x,y+1);
            if(!(h1||h2||h3||h4))
                visited[x][y]=0;
            return h1||h2||h3||h4;

    }

    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.exist(new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}},"ABCESEEEFS"));
    }

}
