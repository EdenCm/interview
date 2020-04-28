public class jianzhi14_CutLine {
    /*
    将长度为n的绳子剪为m段，是m段的乘积最大
    尽可能分成更多的3，如余1，则分成3333....4
                        余2，分为33333...2
     */
    class Solution {
        public int cuttingRope(int n) {

            if (n <= 3) return 1*(n-2);
            int res = 1;


            if (n % 3 == 1){
                res *= 4 ;
                n -= 4;
            }
            if (n % 3 == 2){
                res *= 2;
                n -= 2 ;
            }
            return res * (int)Math.pow(3,n/3);
        }


        /**
         * 动态规划解法
         *
         */
        public int cutMax(int n ){

            // memo[i] 表示将数字i分割（至少分割成两部分）后得到的最大乘积

            int[] memo = new int[n+1];
            memo[1] = 1;
            for (int i = 2; i <= n; i++) {
                // 求解memo[i]
                for (int j = 1; j <= i-1 ; j++) {
                    // j +(i-j)
                    memo[i] = Math.max(memo[i],Math.max(j*(i-j),j*memo[i-j]));
                }
            }
            return memo[n];
        }
    }

    public static void main(String[] args) {
        System.out.println(3);
    }
}
