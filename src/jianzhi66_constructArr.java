import java.util.Arrays;

public class jianzhi66_constructArr {
    /**
     * 构建乘积数组
     */
    class Solution {
        public int[] constructArr(int[] a) {
            // 不能用除法
            int sum = 1;
            int n = a.length;
            int[] res = new int[n];
            // 从前到后计算保存0至i-1的乘积
            for(int i = 0 ,p = 1; i < n; i++){
                res[i] = p;
                p = p * a[i];
            }
            System.out.println(Arrays.toString(res));
            // 从后到前计算保存n-1--i+1的成绩
            for(int j = n-1 ,p = 1 ; j >=0;j--){
                res[j] *= p;
                p = p * a[j];
            }
            // System.out.println(Arrays.toString(res))
            return res;
        }
    }
}
