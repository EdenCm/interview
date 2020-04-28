
import java.util.ArrayList;

public class LeetCode79_WordSearch {
    class Solution {
        private int m,n;// 平面的行和列
        private boolean[][] visited; //元素是否被访问过
        public boolean exist(char[][] board, String word) {
            m = board.length;
            n = board[0].length;
            visited = new boolean[m][n];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                   if (searchWord(board,word,0,i,j)){
                      return true;
                   }
                }
            }
            return false;
        }
        private boolean inArea(int x,int y){
            return x>=0 && x < m && y >= 0 && y <n;
        }
        /* index :word的索引
    startx：开始搜索的x坐标
    starty：开始搜索的y坐标
    从board[startx][starty]开始，寻找word[index。。。word.size()]
 */
        private boolean searchWord (char[][] board,String word,int index,int startx,int starty){
            // 定义移动方向上，右，下，做
            int[][] d = {{-1,0},{0,1},{1,0},{0,-1}};
            if (index == word.length() -1){
                return board[startx][starty] == word.charAt(index);
            }
            if (board[startx][starty] == word.charAt(index)){
                visited[startx][starty] =true;
                // 从startx，starty出发，向四个方向寻找
                for (int i = 0; i <4; i++) {
                    int newx = startx +d[i][0];
                    int newy = startx +d[i][1];
                    if (inArea(newx,newy) && !visited[newx][newy]){
                        //递归调用
                        if (searchWord(board,word,index+1,newx,newy)) {
                            return true;
                        }
                    }
                }
                visited[startx][starty] = false;
            }
            return false;
        }

    }
}
