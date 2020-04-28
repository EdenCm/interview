public class jianzhi4_findNumberIn2DArray {


    // 在二维数组中找到目标值
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            if (matrix.length==0 || matrix[0].length==0) return false;
            int row = 0;
            int cloumn = matrix[0].length - 1;

            while (row < matrix.length && cloumn >= 0){
                int temp = matrix[row][cloumn];
                if (temp == target) return true;
                if (temp > target){
                    cloumn -= 1;
                }else {
                    row += 1;
                }
            }
            return false;

        }
    }
}
