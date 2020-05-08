import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.util.LinkedList;
import java.util.List;

public class jianzhi62_CycleLastRemaining {


    static class Solution{
        public int lastRemain(int n,int m){
            if (n <0 || m <0) return -1;

            // 创建一个linkList存放数组
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            // 定义指针
            int p = 0;
            while (list.size()>1){
                for (int k = 1; k < m; k++) {
                    p += 1;
                    if (p == list.size()) p = 0;
                }
                list.remove(p);
                if (p == list.size()) p = 0;
            }
            return list.get(0);
        }

        /**
         * 数学规律：约瑟夫环问题
         */
        public int lastNumInCycle(int n, int m) {
            if (n <= 0 || m <= 0) return -1;
            int f = 0;
            for (int i = 2; i <= n; i++) {
                f = (f + m) % i;
            }
            return f;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lastRemain(5,3));
    }
}
