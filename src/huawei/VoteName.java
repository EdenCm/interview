package huawei;

import java.util.*;

public class VoteName {
// ||
    static class VoteByName{

        public String vote(String[] str){

            if (str == null || str.length == 0){
                return null;
            }

            HashMap<String,Integer> map = new HashMap<>();
            for (int i = 0; i < str.length; i++) {
                if (str[i].charAt(0) < 65  || str[i].charAt(0) > 90 ) return "‘error.0001’";
                if (!map.containsKey(str[i])){
                    map.put(str[i],1);
                }else {
                    map.put(str[i],map.get(str[i]) +1);
                }
            }
            int temp = 0 ;
            for (String subStr : map.keySet()) {
                if (map.get(subStr) > temp) {
                    temp = map.get(subStr);
                }
            }
            // 找出重复
            List<String> dubString = new ArrayList<>();
            for (String subStr : map.keySet()){
                if (map.get(subStr) == temp){
                    dubString.add(subStr);
                }
            }
            if (dubString.size() >1){
                Collections.sort(dubString, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.charAt(0)- o2.charAt(0) ;
                    }
                });
            }
            return dubString.get(0);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
//        String str = sc.nextLine().trim();
        System.out.println(str);
        String[] strs = str.split(",");

        System.out.println(Arrays.toString(strs));
        VoteByName vb = new VoteByName();
        System.out.println(vb.vote(strs));
    }
}
