public class jianzhi21_reorderArray {

    class Solution {
        public int[] exchange(int[] nums) {
            int l = 0, r = nums.length - 1;
            while (l <= r){
                // l的位置位奇数
                while (l <= r && (nums[l] & 1) == 1) l += 1;
                while (l <= r && (nums[r] & 1) == 0) r -= 1;
                if (l <r ) {
                    int temp = nums[l];
                    nums[l] = nums[r];
                    nums[r] = temp;
                }
            }
            return nums;
        }
    }

    public static void main(String[] args) {
        System.out.println(5&1);
    }
}
