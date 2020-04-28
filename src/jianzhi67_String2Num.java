public class jianzhi67_String2Num {

    static class String2Num{
        public int str2int(String str){
            // null 和 “”
            if (str==null || str.length() == 0 ){
                return 0;
            }
            Boolean ispostive = true;
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                char cur = str.charAt(i);
                // 考虑正负数
                if (i==0 && cur == '+'|| cur =='-'){
                    if (cur =='-'){
                        ispostive = false;
                    }
                }
                // 考虑字母或其他
                if (cur < '0' || cur > '9'){
                    return 0;
                }
                int flag =   ispostive == true ? 1 : -1;
                num = 10 * num  + flag * (cur- '0');
            }
            // 考虑大数
            if (ispostive && num > Integer.MAX_VALUE || !ispostive && num < Integer.MIN_VALUE){
                return 0;
            }
            return num;
        }
    }
}
