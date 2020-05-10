public class Knapstack01DP {

    /**
     * 01背包问题
     * @param weight 每个物品的重量
     * @param value 对应物品的价值
     * @param capacity 背包能承受的重量极限
     *                 memo[i][j]表示第i 个物品放入和不放入两种情况下的最大值
     * @return
     */
     public static int napStack01 (int[] weight,int[] value,int capacity){
        assert(weight.length==value.length);
        int n = weight.length; // 得到物品总数
         if (n==0) return 0;
        int[][] memo = new int[n][capacity+1];

        // 放第0 个物品时对应的memo中的价值序列
         for (int i = 0; i <=capacity; i++) {
             memo[0][i] = (i >= weight[0] ? value[0]: 0);
         }
         // 从第一个物品开始，依次确定memo[i][j]值
         for (int i = 1; i < n ; i++) {
             for (int j = 0; j <= capacity; j++) {
                 memo[i][j] = memo[i-1][j];
                 if ( j >= weight[i]){ // 此时重量大于第i个物品重量 允许放入第i个物品
                     memo[i][j] = Math.max(memo[i][j],value[i] +memo[i-1][j-weight[i]]);
                 }
             }
         }
         return memo[n-1][capacity];
     }

    public static void main(String[] args) {
        int[] weight = {1,2,3};
        int[] value = {6,10,12};
        System.out.println(napStack01(weight,value,5));
    }
}
