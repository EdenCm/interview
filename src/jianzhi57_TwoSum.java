import java.util.HashMap;

public class jianzhi57_TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            // 方法一 54ms
//            int [] res = new int[2];
//            HashMap<Integer,Integer> hashMap = new HashMap<>();
//            for (int i = 0; i < nums.length; i++) {
//                if (hashMap.containsKey(target - nums[i])) {
//                    res[0] = nums[i];
//                    res[1] = target - nums[i];
//                    break;
//                }else {
//                    hashMap.put(nums[i],i);
//                }
//            }
//            return res;
            // 方法二  3ms
            int[] res = new int[2];
            int l = 0,r = nums.length-1;
            while (l < r){
                if (nums[l] + nums[r] == target){
                    res[0] = nums[l];
                    res[1] = nums[r];
                }
                if (nums[l] + nums[r] > target) r-=1;
                if (nums[l] + nums[r] < target) l+=1;
            }
            return res;

        }
    }
}
