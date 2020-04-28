import java.util.Arrays;

public class jianzhi12_MatrixExitRoute {

    static class Solution {
        public boolean exist(char[][] board, String word) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (dfs(board,word,0,i,j))
                        return true;
                }

            }
            return false;
        }
        /*
        board :搜寻的矩阵
        word：要 搜寻的单词
        u： 搜寻到单词的第u个字母
        x:搜寻到矩阵中x坐标
        y： 搜寻到矩阵中y坐标
         */
        private boolean dfs(char[][] board,String word,int u,int x,int y){
            // 如果此时搜寻到word的第u个字母等于word的长度则表示搜寻成功
//            if (u == word.length()) return true;
            // 如果搜寻到该位置的字母不等于第word中第u个字母，该次搜索失败
            if (board[x][y] != word.charAt(u)) return false;
            // 如果等于则开始下个字母的搜索
            // 定义四个搜寻方向 上，右，下，左
            int[] dx = {-1,0,1,0},dy = {0,1,0,-1};
            // 搜寻过的矩阵中的字母要标记，确保本次搜索中不会重复搜索该位置
            char t = board[x][y];
            board[x][y] = '*';
            System.out.println("------矩阵为-----");
            for (int i = 0; i < board.length; i++) {
                System.out.println(Arrays.toString(board[i]));
            }
            if (u+1==word.length()) return true;
            // 开始从四个方向搜索
            for (int i = 0; i < 4; i++) {
                int a = x + dx[i], b = y + dy[i];
                // 保证搜索在矩阵的合理索引范围内，才能继续搜索
                if (a >= 0 && a < board.length && b >= 0 && b < board[a].length){
                    // 开始下次搜寻，搜寻为true 则该次搜寻返回true
                    if (dfs(board,word,u+1,a,b)) return true;
                }
            }
            // 搜寻过，赋值为原值
            System.out.println("此次没找到");
            board[x][y] = t;
            for (int i = 0; i < board.length; i++) {
                System.out.println(Arrays.toString(board[i]));
            }
            return false;
        }

    }
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//        char[][] board = {{'a'}};
        System.out.println("原始矩阵为");
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        Solution solution = new Solution();

//        System.out.println(solution.toString());
        String word = "ABCCED";
//        String word = "a";
        System.out.println(solution.exist(board,word));
    }
}
