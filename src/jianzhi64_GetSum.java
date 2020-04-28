public class jianzhi64_GetSum {
    /**
     * 求1-n的和不能用乘法除法，for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
     */

    /**
     * 利用递归左
     */
    class Solution {
        public int sumNums(int n) {
            int res = n;
            boolean ans = (n > 0) && ((res += sumNums(n -1)) > 0);  // 当n > 0 不满足时后面的就不会进行判断
            return res;
        }
    }
}
