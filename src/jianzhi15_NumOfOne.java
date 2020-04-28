public class jianzhi15_NumOfOne {
    public class Solution {
        // you need to treat n as an unsigned value

        // 二进制数中1的数量
        public int hammingWeight(int n) {
            // 方法一
//            int count = 0;
//            while(n!=0){
//                count += 1;
//                n = (n-1)&n;
//            }
//            return count;

            // 方法二
            // 最多循环32次
            int count = 0;
            int flag = 1;
            while (flag != 0){
                if ((n & flag) != 0){
                    count += 1;
                }
                flag = flag << 1;
            }
            return count;
        }
    }
}
