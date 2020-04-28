import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
public class jianzhi38_StringPermution {
    static class Solution {
        HashSet<String> res = new HashSet<String>();
//        List<String> res = new LinkedList<>();
        Boolean [] used ;
        public String[] permutation(String s) {
            // 潘孔
            if (s == null || s.length() == 0) return new String[0];

            // 建立访问过的标记数组
            used = new Boolean[s.length()];
            // 初始化used的值
            for (int i = 0; i < used.length; i++) {
                used[i] = false;
            }
            StringBuilder sb = new StringBuilder();

            findPermytation(s,0,sb);
            // 删除重复值
            String[] res_list = new String[res.size()];
            int i = 0;
            for (String str : res) {
                res_list[i] = str;
                i += 1;
            }
            return res_list;
        }
        private void findPermytation(String s,int index ,StringBuilder sb){
            if (index == s.length()){
                res.add(new String(sb.toString()));
                return;
            }
            for (int i = 0; i < s.length(); i++) {
                if (!used[i]){
                    sb.append(s.charAt(i));
                    used[i] = true;
                    findPermytation(s,index+1,sb);
                    used[i] = false;
                    int size = sb.length();
                    sb.deleteCharAt(sb.length()-1);
                }
            }
            return;
        }
    }

    public static void main(String[] args) {
        StringBuilder sb  = new StringBuilder();
        String s = "ava";
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        sb.deleteCharAt(sb.length() -1);
        System.out.println(sb.toString());
        Solution solution = new Solution();
        String[] res = solution.permutation(s);
        System.out.println(Arrays.toString(res));
    }
}
