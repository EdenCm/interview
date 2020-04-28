import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class jianzhi48_LongestSubstring {
    static class Solution{
        public int findLongestSubString(String str){

            int res = 0;
            int n = str.length();
            List<Integer> max_length = new ArrayList<>(n + 1);
//            max_length.set(8,'a' -'a');
            for (int i = 0; i < str.length()-1; i++) {
                HashSet<Character> subSet = new HashSet<>();
                subSet.add(str.charAt(i));

                for (int j = i+1; j < str.length()-1  ; j++) {
                    if (subSet.contains(str.charAt(j))){
                        max_length.add(subSet.size());
                        break;
                    }
                    subSet.add(str.charAt(j));
                }
                if(max_length.size() == i){
                    max_length.add(subSet.size());
                }
            }
            res = Collections.max(max_length);
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "arabaacfrf";
        System.out.println(solution.findLongestSubString(str));
        System.out.println(str.charAt(1)-'a');
    }

}
