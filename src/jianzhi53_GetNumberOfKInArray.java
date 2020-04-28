public class jianzhi53_GetNumberOfKInArray {
    /**
     * 排序数组中查找某一数字出现的次数
     *
     *
     * 简单总结一下就是在[0,0,0,...,0] (共k个数) 里面搜索0。
     *
     * 使用第一个会返回位置0
     *
     * 使用第二个会返回k - 1
     *
     * 也可以看做寻找 第一个>= target的元素（左侧元素小于target） 和 最后一个<= target（左侧元素小于等于target）的元素
     *
     *
     *  一般写二分的思考顺序是这样的：首先通过题目背景和check(mid)函数的逻辑，判断答案落在左半区间还是右半区间。
     *  左右半区间的划分方式一共有两种：
     *
     *     中点mid属于左半区间，则左半区间是[l, mid]，右半区间是[mid+1, r]，更新方式是r = mid;或者 l = mid + 1;，此时用第一个模板；
     *     中点mid属于右半区间，则左半区间是[l, mid-1]，右半区间是[mid, r]，更新方式是r = mid - 1;或者 l = mid;，此时用第二个模板；
     */
    static class Solution {
        public int search(int[] nums, int target) {
            if (nums == null || nums.length == 0 ) return 0;
            int count = 0;
            int l = 0,r = nums.length -1;
            // 符合条件的mid在左区间  寻找第一个大于等于target的值
            while (l < r){  // [l,mid ] [mid+1,r]
                int mid = l + r >> 1;
                if (nums[mid]< target) l = mid +1;
                else r = mid;
            }
            if (nums[l] != target ) return 0;
            System.out.println("l为："+l);
            int left = l;

            l = 0;
            r = nums.length - 1;
            // 符合条件的mid在右区间 寻找最后一个小于等于target的值
            while (l < r){   //  [l, mid -1] [mid,r]
                int mid = l + r + 1 >>1;
                if (nums[mid] <= target) l = mid;
                else r = mid -1;
            }
            System.out.println("r为"+r);
            return r - left + 1 ;
        }
    }

    public static void main(String[] args) {
//        int[] nums = {5,7,7,8,8,8,9,10,11,12};
        int[] nums = {2,2};
        Solution solution = new Solution();

        System.out.println(solution.search(nums,2));
    }


}
