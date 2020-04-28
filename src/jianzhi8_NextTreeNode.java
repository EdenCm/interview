public class jianzhi8_NextTreeNode {

//     * Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode father;
          TreeNode(int x) { val = x; }
      }
        /*
        在二叉树中找到节点在中序遍历中的后继节点
         */
    class Solution {
        public TreeNode inorderSuccessor(TreeNode p) {
            if (p.right !=null){
                p = p.right;
                while (p.left!=null){
                    p = p.left;
                }
                return p;
            }
            while (p.father != null &&  p == p.father.right){
                p = p.father;
            }
            return p.father;
        }
    }
}
