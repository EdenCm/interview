import java.util.Collections;

public class jianzhi56_SingleNumber {
    /**
     * 数组中只有两个数组没有重复数字，其余均有两位数字
     * @param nums
     * @return
     */
    public int[] singleNumber(int[] nums){

        if (nums == null || nums.length == 0 ) return new int[]{};

        int temp = 0;
        for (int num : nums) {
            temp ^= num;
        }

        int findOneNum = 1;
        while ((temp & findOneNum) == 0 ){
            findOneNum <<= 1;
        }
        int a = 0,b = 0;
        for (int num : nums) {
            if ((num & findOneNum) == 0){
                a ^= num;
            }else {
                b ^= num;
            }
        }

        return new int[]{a,b};

    }


}
