import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class jianzhi57_1FindContinuousSequence {
    // 双指针O(n)
    static class Solution {
        public int[][] findContinuousSequence(int target) {
//            int[][] res = new int[5][1];
            List<int[]> res_list = new ArrayList<>();
            for (int i = 1,j = 1,s = 1; i <= target; i++) {
                while (s <target) s += ++j;
                System.out.println(i+" " +j+" "+s);
                if (s == target && j - i + 1 > 1) {
//                    List<Integer> list = new ArrayList<>();
                    int[] list = new int[j-i +1];
                    for (int k = 0; k < j-i +1; k++) {
                        list[k] = k +i;
                    }
                    res_list.add(list);
                }
                s -= i;
            }
            return res_list.toArray(new int[res_list.size()][]);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] continuousSequence = solution.findContinuousSequence(15);
        for (int[] ints : continuousSequence) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
