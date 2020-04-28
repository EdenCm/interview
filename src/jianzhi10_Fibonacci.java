public class jianzhi10_Fibonacci {
    static class Solution {
        public int fib(int n) {
            int[] memo= new int[n+1];
            memo[0] = 0;
            memo[1] = 1;
            for (int i = 2; i <= n; i++) {
                memo[i] = (memo[i-1] + memo[i-2]) % 1000000007;
//                memo[i] = (memo[i-1] + memo[i-2]);
            }
            return memo[n];

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int fib = solution.fib(40);
        System.out.println(fib);
    }
}
