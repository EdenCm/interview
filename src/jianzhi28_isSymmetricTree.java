public class jianzhi28_isSymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
  // 判断二叉树是否镜像对称

    class Solution    {
        public boolean isSymmetric(TreeNode root) {
            if(root == null) return true;
            return dfs(root.left,root.right);
        }
        private boolean dfs(TreeNode p, TreeNode q){
            // 只有p与q都为null时返回true 否则都返回false
            if (p == null || q == null) return p == null && q == null;
            if (p.val != q.val) return false;
            return dfs(p.left,q.right) && dfs(p.right,q.left);
        }

    }

}
