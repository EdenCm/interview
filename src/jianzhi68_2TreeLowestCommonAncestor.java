public class jianzhi68_2TreeLowestCommonAncestor {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    class Solution {
        /**
         * 二叉树最小公共祖先
         * @param root
         * @param p
         * @param q
         * @return
         */
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null) return null;
            // 如果找到p/q return
            if(root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);
            // p & q != null p q belong left and right two side in tree
            if (left != null && right != null) return root;
            // only find one (p &q) then they belong one side in tree
            if (left == null) return right;
            else return left;
        }
    }
}
