package secondTry;

public class j_3_DuplicateArray {
    static class Solution{
        public int findRepeatNumber(int[] nums) {
            int res = -1;
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                if (nums[i] == nums[nums[i]] && i != nums[i]) {
                    res = nums[i];
                    break;
                }
                while (i != nums[i]){
                        int temp = nums[i];
                        nums[i] = nums[nums[i]];
                        nums[temp] = temp;
                    }
                }
            return res;
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(solution.findRepeatNumber(nums));
        double pow = Math.pow(10, 2);
        int a  = (int) pow;
        System.out.println( );
    }


}
