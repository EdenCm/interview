public class jianzhi67_String2Num {

    static class String2Num{
        public int str2int(String str1){
            // null 和 “”
            if (str1==null || str1.length() == 0 ){
                return 0;
            }
            String str = str1.trim();
            Boolean ispostive = true;
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                char cur = str.charAt(i);
                // 考虑正负数
                if (i==0 && cur == '+'|| cur =='-'){
                    if (cur =='-'){
                        ispostive = false;
                    }
                    if (str.length() == 1) {
                        return 0;
                    }
                    continue;
                }
                // 考虑字母或其他
                if ((cur < '0' || cur > '9')&& i == 0){
                    return 0;
                }

                if (cur < '0' || cur > '9' && i > 1){
                    break;
                }
                int flag =   ispostive == true ? 1 : -1;
                //String str ="-91283472332"
                if (ispostive && num > Math.pow(2,31) -1 ){
                    return  (int) (Math.pow(2,31) -1);
                }
                if (!ispostive && num < -(Math.pow(2,31) -1)){
                    return (int) (-(Math.pow(2,31) -1));
                }
                num = 10 * num  + flag * (cur- '0');
                // 考虑大数

            }
            return num;
        }
    }

    public static void main(String[] args) {
        String2Num string2Num = new String2Num();
//        String str ="4193 with words";
        String str ="-91283472332";
        System.out.println(string2Num.str2int(str));
        System.out.println(Math.pow(2,31) -1);
    }
}
