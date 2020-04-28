public class jianzhi10_2_QingWaStairs {

    /**
     * 青蛙跳台阶，每次只能一步或两步
     */
    class Solution {
        public int numWays(int n) {
            int[] li = new int[n+3];
            li[0] = 1;
            li[1] = 1;
            li[2] = 2;
            if(n <= 2) return li[n];
            for(int i = 3; i <= n; i++){
                li[i] =(li[i-1] +li[i-2])%1000000007 ;
            }
            return li[n];
        }
    }
}
