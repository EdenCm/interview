public class jianzhi55_TreeDepth {

    /**
     * 二叉树的深度求解
     */
    class solution{
        class TreeNode{
            private TreeNode left;
            private TreeNode right;
            private Integer value;
            public TreeNode(Integer value){
                this.value = value;
                this.left = null;
                this.right = null;
            }
        }
        public int treeDepth(TreeNode root){
            if (root == null){
                return 0;
            }
            int left = treeDepth(root.left);
            int right = treeDepth(root.right);
            return left > right ? (left + 1 ): (right+1);
        }
    }

}
