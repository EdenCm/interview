public class jianzhi42_MaxSubArray {

    /**
     *
     * 连续子数组中的最大和
     * 巧办法
     */
    class Solution {
        public int maxSubArray(int[] nums) {
            int  res = -100 ,s = 0;
            for(int x :nums){
                if(s <0 ) s = 0;    // if(s <= 0) s = x;
                s += x;             // else s += x;
                res = Math.max(res,s);
            }
            return res;
        }
    }
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10 ; j++) {
                if (j <= i){
                    if (j == i) {
                        System.out.print(i +"*"+j+ "="+ i * j +"\n");
                    }else {
                        System.out.print(i +"*"+j+ "="+ i * j + "\t");
                    }
                }
            }

        }
        int i = 555;
        int j = 555;
        System.out.println(i==j);
    }
}

