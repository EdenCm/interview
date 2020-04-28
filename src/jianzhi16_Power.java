public class jianzhi16_Power {

    class Solution {
        // 遍历法超出了时间限制
//        public double myPow(double x, int n) {
//            int res = 1;
//            for(int i = 0; i < Math.abs(n) ;i ++){
//                res *= x;
//            }
//            if (n < 0) res  = 1 / res;
//            return res;
//
//        }
        public double myPow(double x, int n) {
            int res = 1;
            if (n < 0){ //为避免n=-2^31取正溢出，先处理一次负数情况

                x = 1/x;
                res *= x;
                n = -(n+1);
            }

            while (n >0){
                // n 为奇数
                if ((n & 1) == 1){
                    res *= x;
                }
                // 求x的 2 次幂
                x *= x;
                // n右移一位，整除2
                n >>=1;
            }
            return res;

        }


    }
}
