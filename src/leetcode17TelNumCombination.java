

import java.util.ArrayList;
import java.util.List;
public class leetcode17TelNumCombination {
    static class Solution {
        private String[] letter;
        private List<String> res;
        public List<String> letterCombinations(String digits) {
            letter = new String[]{" ","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            res =null;
            res = new ArrayList<>();
            if (digits.length()==0 || digits== null ){
                return res;
            }
            findCombination(digits,0,"");

            return res;
        }
        private void findCombination(String digits, int index,String s){
            if (index == digits.length()){
                // save s
                res.add(s);
                return;
            }
            char c = digits.charAt(index);

            String letters =  letter[c-'0'];
            for (int i = 0; i < letters.length(); i++) {
                findCombination(digits,index+1,s+letters.charAt(i));
            }

        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.letterCombinations("234");
        System.out.println(list);
        char a = '1';
        System.out.println(a-'3');

    }
}
