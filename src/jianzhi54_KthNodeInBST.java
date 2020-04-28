import java.util.ArrayList;
import java.util.List;
public class jianzhi54_KthNodeInBST {

      public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
      }
    class Solution {
        List<Integer> list = new ArrayList<>();
        public int kthLargest(TreeNode root, int k) {
            if (root == null ) return -1;
            dfs(root);
            return list.get(list.size() -k);
        }
        private void dfs(TreeNode root){
            if (root == null) return;

            dfs(root.left);
            list.add(root.val);
            dfs(root.right);
        }

    }
}
