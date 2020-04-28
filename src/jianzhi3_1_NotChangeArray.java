import java.util.Arrays;

public class jianzhi3_1_NotChangeArray {
    /**
     * 长度为n的数组里所以有数字都在0-n-1范围内
     */
    // 不修改数组 n+1 长度数组中1-n的数字寻找重复数字
    static class Solution {
        private int[] nums;

        public int[] getNums() {
            return nums;
        }

        public void setNums(int[] nums) {
            this.nums = nums;
        }

        @Override
        public String toString() {
            return "Solution{" +
                    "nums=" + Arrays.toString(nums) +
                    '}';
        }

        /**
         * 在不修改原数组的基础上，用二分搜索，来缩小搜索范围
         * @return
         */
        public int findDuplicate() {
            int l = 1,r = nums.length -1;
            while (l < r){
                int mid = l + r >> 1;
                System.out.println("l："+l + " r:"+r+"mid:"+mid);
                int s = 0;
                for (int x : nums) {
                    if (x>= l && x<= mid) s+=1;
                }
                if (s > (mid -l+1)) {
                    r = mid;
                }else {
                    l = mid+1;
                }
            }
            return r;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {1,4,4,2,4};
//        int [] nums = {3,1,3,4,2};
        solution.setNums(nums);
        System.out.println(solution.findDuplicate());
//        System.out.println(4>>1);
    }
}
