public class jianzhi43_NumberOf1 {


     static class Solution{

        public int numberOf1(int n){
            int count = 0;
            if (n==0) return count;
            if (n < 0) n = Math.abs(n);
            for (int i = 1; i <= n ; i++) {
                count += find1InNum(i);
            }
            return count;
        }
        private int find1InNum(int n){
            int findCount = 0;
            while (n != 0){
                if (n % 10 ==1) findCount += 1;
                n = n/10;
            }
            return findCount;
        }

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numberOf1(12));
    }
}
