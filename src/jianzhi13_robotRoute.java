import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class jianzhi13_robotRoute {

    static class Solution {
        private int single_num(int num){
            int s = 0;
            while (num > 0){
                s += num % 10;
                num /= 10;
            }
            return s;
        }

        private int dot_num(int[] dot){
            return single_num(dot[0]) + single_num(dot[1]);
        }
        public int movingCount(int m, int n, int k) {
            int res = 0;
            // 1.建立辅助矩阵判断该矩阵点是否是否访问过
            boolean[][] st = new boolean[m][n];
            // 2. 建立坐标数组
            int[] dot = new int[2];
            dot[0] = 0;
            dot[1] = 0;

            // 3. 建立访问过的点的队列
            Queue<int[]> queue = new ConcurrentLinkedQueue<>();
            queue.add(dot);
            int[] dot_head = new int[2];
            while (queue.size() > 0){
                // 得到并删除队列中队首的元素
                dot_head =  queue.remove();
                // 判断其是否合理 坐标之和是否大于k 或者 没有被访问过
                if (dot_num(dot_head) > k || st[dot_head[0]][dot_head[1]] == true)
                    continue;
                // 标记该点已访问
                st[dot_head[0]][dot_head[1]] = true;
                // 总点数加1
                res += 1;
                // 开始下次搜索
                // 建立四个方向数组
                int[] dx = {-1,0,1,0}, dy = {0,1,0,-1};
                for (int i = 0; i < 4; i++) {
                    int a = dot_head[0] + dx[i];
                    int b = dot_head[1] + dy[i];
                    if (a >= 0 && a < m && b >= 0 && b < n){
                        int[] dot_temp = new int[2];
                        dot_temp[0] = a;
                        dot_temp[1] = b;
                        queue.add(dot_temp);
                    }
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] num = {1,23};
//        int i = solution.dot_num(num);
//        System.out.println(i);
        int i = solution.movingCount(3, 1, 0);
        System.out.println(i);
    }
}
