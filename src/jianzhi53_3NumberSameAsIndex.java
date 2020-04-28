public class jianzhi53_3NumberSameAsIndex {
    // 单调递增且数字唯一数组中数值和下标相等的数字

    class Solution {
        public int getNumberSameAsIndex(int[] nums) {
            if (nums == null || nums.length == 0 ) return 0;

            int l = 0 ,r = nums.length -1;
            // 找到l左边的数均小于下标，使右边的数大于下标
            while (l < r ){  // [0,mid] [mid+1 ,r]
                int mid = l + r >> 1;
                if (nums[mid] < mid) l = mid + 1;
                else r = mid;
            }
            // 特判断l依然大于下标，则表明数组中无此数字
            if(nums[l] > l) return -1;
            return nums[l];
        }
    }
}
