public class jianzhi26_SubTree {
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    class Solution {
        public boolean isSubStructure(TreeNode A, TreeNode B) {
            if (A == null || B == null) return false;
            if (isPart(A,B)) return true;
            return  isSubStructure(A.left,B) || isSubStructure(A.right,B);

        }
        private boolean isPart(TreeNode p1,TreeNode p2){
            if (p2 == null) return true;
            if (p1 == null || p1.val != p2.val) return false;
            return isPart(p1.left,p2.left) && isPart(p1.right ,p2.right);
        }

    }
}
