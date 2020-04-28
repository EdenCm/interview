public class jianzhi47_GetMaxGiftValue {

    /**
     * 动态规划解决
     */
    static class Solution {
        public int maxValue(int[][] grid) {

            int n = grid.length,m = grid[0].length;
            int[][] f = new int[n+1][m+1];
            for (int i = 1; i <= n; i++) { // 从1开始算，不用判断边界条件0
                for (int j = 1; j <= m; j++) {
                    f[i][j] = Math.max(f[i-1][j],f[i][j-1]) +grid[i-1][j-1];
                    i-=1; j-=1;
                    System.out.println("f["+i+"]["+j+"]值为"+f[i+1][j+1]);
                    i+=1;j+=1;
                }
            }
            return f[n][m];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        int maxValue = solution.maxValue(arr);
        System.out.println(maxValue);
    }

}
