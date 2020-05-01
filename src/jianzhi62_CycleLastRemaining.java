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
                for (int k = 1; k <= m; k++) {
                    p += 1;
                    if (p == list.size()) p = 0;
                }
                list.remove(p);
            }
            if (p == list.size()) p = 0;
            return list.get(0);
        }
    }
}
