package secondTry;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class j_57_MaxSlideWindow {


    static class Solution{

        public int[] slidWindow(int[] nums,  int k){
            int n  = nums.length;
            if (k >= n){
                Arrays.sort(nums);
                return new int[]{nums[n-1]} ;
            }
            int[] res = new int[n-k+1];

            List<Integer> list = new LinkedList<>();
            for (int i= 0 ; i < n - k +1;i++){
                if (list.size() == 0){
                    for (int j = 0; j < k; j++) {
                        list.add(nums[j]);
                    }
                }else {
                    list.remove(0);
                    list.add(nums[k+i-1]);
                }
                System.out.println(list);
                int max_value = Collections.max(list);
                res[i] = max_value;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,3,5,5,6,7};
//        int[] nums = {3,6};
        int [] array = solution.slidWindow(nums,3);
        System.out.println(Arrays.toString(array));
    }
}
