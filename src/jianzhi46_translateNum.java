public class jianzhi46_translateNum {

    /**题目
     * 给定一个数字，我们按照如下规则把它翻译为字符串：
     * 0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
     * 一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
     *
     */

    static class Solution{
        public int translateNum(int num){
            String str =  num + "";
            int[] dp = new int[11];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 1; i < str.length();i++){
                if (str.charAt(i-1) == '0' || Integer.parseInt(str.substring(i-1,i+1)) > 25){
                    dp[i + 1] = dp[i];
                }else {
                    dp[i + 1] = dp[i] + dp[i-1];
                }
            }
            return dp[str.length()];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.translateNum(258);
        System.out.println(i);
    }
}
