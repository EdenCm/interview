import java.util.HashMap;

public class jianzhi50_firstUniqChar {

    class Solution {
        public char firstUniqChar(String s) {
            char res = ' ';
            if(s == null || s.length() == 0 )
                return res;
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if ( map.containsKey(s.charAt(i)) ){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }else {
                    map.put(s.charAt(i),1);
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if (map.get(s.charAt(i)) ==1){
                    res = s.charAt(i);
                    break;
                }

            }
            return res;

        }
    }
}
