public class jianzhi11_revoleArrayMinNum {
    class Solution {
        public int minArray(int[] numbers) {
            // 确定输入有效
            int n = numbers.length - 1;
            if (n < 0) return -1;
            // 将结尾与开头相等的数字排除
            while (n > 0 && numbers[n] == numbers[0]) n--;
            // 如果结尾的数大于开始的数，则说明整个数组单调递增
            if (numbers[n] >= numbers[0]) return numbers[0];
            // 否则开始二分搜索
            int l = 0, r = n;
            while (l < r){
                int mid = l + r<<1; // [0,mid] [mid+1,r]
                if (numbers[mid] < numbers[0]) r = mid;
                else l = mid +1;
            }
            return numbers[l];
        }
    }

    public static void main(String[] args) {
        System.out.println(5<<1);
    }
}
