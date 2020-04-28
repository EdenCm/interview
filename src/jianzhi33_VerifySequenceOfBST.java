public class jianzhi33_VerifySequenceOfBST {
    class Solution{

        private int[] seq;
        public boolean verifyPostorder(int[] postorder) {
            seq = postorder;
            return dfs(0,seq.length-1);
        }
        // 输入序列的开始索引及结束索引
        private boolean dfs(int l ,int r){
            if (l >= r) return true; // 说明检索判断成功
            int root = seq[r]; // 最后的元素为根节点
            int k = 1;
            // k 为左右子树的分界点
            while (k < r && seq[k] < root) k ++;
            for (int i = k; i < r; i++) {
                if (seq[i] < root) return false;
            }
            return dfs(l,k -1) && dfs(k +1 ,r);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 0; i++) {
            System.out.println("1");
        }
        System.out.println("2");
    }


}
