import java.util.Arrays;

public class jianzhi3_DuplicateArray {
    // 修改数组找出重复数字
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

        public int duplicateInArray() {
            for (int num : nums) {
                if (num <0 || num >= nums.length ){
                    return -1;
                }
            }
            for (int i = 0; i < nums.length; i++) {
                while (i != nums[i] && nums[nums[i]] != nums[i]){
                    int temp ;
                    temp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = temp;
                    System.out.println(this.toString());
                }
                if (i != nums[i] && nums[nums[i]] == nums[i]){
                    return nums[i];
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int []  nums = {2, 3, 5, 4, 3, 2, 6, 7};
        solution.setNums(nums);
        System.out.println(solution.duplicateInArray());

    }
}
