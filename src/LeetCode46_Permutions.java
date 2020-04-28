
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class LeetCode46_Permutions {
    static class Solution {
        private List<List<Integer>> res;
        private ArrayList<Integer> used;
        public List<List<Integer>> permute(int[] nums) {
            used = new ArrayList<Integer>(); // 使用过的字母
            res = new ArrayList<List<Integer>>(); // 返回结果集
            // 判空
            if (nums == null || nums.length == 0){
                return null;
            }
//            System.out.println(used);
//            System.out.println(nums.length);
            // 初始化use数组，默认值为0，代表没访问过；
            for (int i = 0; i < nums.length; i++) {
                used.add(0);
            }
            List<Integer> list = new ArrayList<>();
//            list.add(1);
            findPermution(nums,0,list);
            return res;
        }
        private void findPermution(int[] nums, int index,List<Integer> list){
            if (index == nums.length){
                res.add(new ArrayList<>(list));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used.get(i) == 0){
                    list.add(nums[i]);
                    used.set(i,1);
                    findPermution(nums,index+1,list);
                    used.set(i,0);
                    list.remove(list.size()-1);
                }
            }
            return;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2};
        int [] use = new int[10];
        solution.permute(nums);
        System.out.println(solution.res);
//        String [] str = {"1","2"};
//        List<String> str_list = new LinkedList<String>(Arrays.asList(str));
//
        List<Integer> int_list = new LinkedList<Integer>();
        int_list.add(3);
        int_list.add(4);
        Integer[] int_ = int_list.toArray(new Integer[int_list.size()]);
        System.out.println(Arrays.toString(int_));
//        System.out.println(used);
    }
}
