public class jianzhi68_1BSTLowestCommonAncestor {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class Solution {
        /**
         * 二分搜索树最小公共祖先
         * @param root
         * @param p
         * @param q
         * @return
         */
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null) return null;
            if(p.val == q.val) return p;
            while(root != null){
                if(root.val < p.val && root.val < q.val){
                    root = root.right;
                }else if( root.val > q.val && root.val > p.val ){
                    root = root.left;
                }else{
                    break;
                }
            }
            return root;
        }
    }
}
