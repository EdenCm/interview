
import java.util.ArrayList;
import java.util.List;
public class jianzhi45_MinNum {
    static class Solution {
        public String minNumber(int[] nums) {
            List<String> strList = new ArrayList<>();
            for (int num : nums) {
                strList.add(String.valueOf(num));
            }
            System.out.println("strlist排序前"+strList);
            /*
         Arrays.sort(strNumbers, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return (o1 + o2).compareTo(o2 + o1);//升序
		}
	    });
             */
            strList.sort((s1, s2) -> (s1 + s2).compareTo(s2 + s1));//
            System.out.println("strlist排序后"+strList);
            StringBuilder sb = new StringBuilder();
            for (String str : strList) {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10,3,2};
        System.out.println(solution.minNumber(nums));

    }

}
