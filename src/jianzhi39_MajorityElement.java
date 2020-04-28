public class jianzhi39_MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            int count = 0, val = -1;
            for (int num : nums) {
                if (count == 0){
                    count = 1;
                    val = num;
                }else {
                    if (num == val){
                        count += 1;
                    }else {
                        count -= 1;
                    }
                }
            }
            return val;
        }
    }
}
