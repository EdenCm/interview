import java.util.Arrays;

public class jianzhi60_twoSum {
    // n枚骰子，每个数字出现的概率
    static  class Solution{
        private final int sideNum = 6;
        public double[] towSum(int n){

            if (n < 1) return new double[1];
            // 返回值 有三个时 范围为[3,18] [n,n* 6]
            double[] res = new double[n * 6-n+ 1  ];
            int max_value = n * sideNum;
            int[][] f = new int[n+1][max_value +1];

            // 初始化只有一个骰子的情况
            for (int i = 1; i <= sideNum ; i++) {
                f[1][i] = 1;
            }
            // 增加骰子的个数
            for (int k = 2 ; k <= n ; k++){
                // 第k个骰子的点数和sum范围为k- k*6
                for (int sum = k ; sum <= k * sideNum;sum++){
                    for (int i = 1; i < sum && i<= sideNum;i++){
                        f[k][sum] += f[k-1][sum - i];
                    }
                }
            }
            int total = (int) Math.pow(sideNum,n);
            for (int sum = n; sum <= n* sideNum ; sum++) {
                res[sum-n] = f[n][sum] * 1.0 / total;
                System.out.println(f[n][sum]+" "+ total);
                System.out.println(f[n][sum] / total);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution =  new Solution();
        System.out.println(Arrays.toString(solution.towSum(2)));
    }

}
