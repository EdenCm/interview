package secondTry;

public class j_58_ReverseString {


    class Solution{

        public String reverseStr(String str){
            if (str == null ||str.length() == 0){
                return str;
            }

            String[] s = str.split(" ");
            StringBuilder sb = new StringBuilder();

            for (int i = s.length - 1 ; i >= 0 ; i--) {
                if (!s[i].equals(" ")){
                    sb.append(s[i]);
                    sb.append(" ");
                }
            }
            return sb.toString().trim();

        }
    }
}
