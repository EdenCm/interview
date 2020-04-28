public class jianzhi53_2MissingNumber {
    // 0- n-1 数组中缺失的数字
    class Solution {
        public int missingNumber(int[] nums) {
            if (nums == null || nums.length == 0 ) return 0;

            int l = 0 ,r = nums.length -1;
            while (l < r){  // [0,mid] [mid+1,r]
                int mid = l + r >> 1;
                if (nums[mid] == mid) l = mid + 1;
                else r = mid;
            }
            // 特判下缺失的是否是值n-1
            if (nums[r] == r ) return r +=1;
            return r;
        }
    }
}
