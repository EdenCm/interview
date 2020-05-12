public class jianzhi56_2_SingleNumInThree {
    /**
     * 数组中只有一个数字重复了一次，其他数组均重复了三次
     */
    class Solution{

        public int SingleNumOther3(int[] nums){
            int res = 0;
            for (int i = 0; i < 32; i++) {
                int count = 0; // 记录当前位上1的个数
                int bit = 1 << i;
                for (int num : nums) {
                    if ((num & bit) != 0){
                        count += 1;
                    }
                }
                if ((count % 3 ) != 0){
                    // 不等于0说明该位置是唯一元素出现在该位置上
                    res |= bit;
                }

            }
            return res;
        }

    }
}
