import java.util.Arrays;

public class jianzhi61_PukIsContinuous {


    static class Solution{
        public Boolean isContinuous(int [] nums){
            boolean res = false;
            if (nums == null || nums.length == 0) return res;

            Arrays.sort(nums); // 排序nums 升序

            // 统计大小王的个数
            int king = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0){
                    king += 1;
                }
            }
            // 统计是否有对子
            // 统计有多少个空

            int totalGap = 0;
            for (int i = nums.length-1; i > king; i--) {
                if (nums[i] == nums[i-1]) return false;
                // 统计间隔
                totalGap += nums[i] - nums[i-1] -1;
            }
            if (totalGap <= king ) res = true;
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,4,9,0};
        System.out.println(solution.isContinuous(nums));


    }
}
