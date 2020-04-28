import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class jianzhi34_TreePathSum {

    /*
    在树中找到和为某值的路径
     */
    class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    class Solution {
        private List<List<Integer>> res = new ArrayList<>();
        private List<Integer> path = new ArrayList<>();
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            // 判空
            if (root == null) return res;
            dfs(root,sum);
            return res;
        }
        private void dfs(TreeNode root, int sum){
            // 确定递归终止条件
            if (root == null) return;
            // 先将遍历到的节点值加入单次列表中
            path.add(root.val);
            // 将root.val从sum中减去
            sum -= root.val;
            // 如果达到叶节点且sum为0，此时将path复制一份加入res中
            if (root.left == null && root.right == null && sum == 0) res.add(new ArrayList<>(path));
            // 递归左子树
            dfs(root.left,sum);
            // 递归右子树
            dfs(root.right,sum);
            int size = path.size();
            path.remove(size -1);
        }
    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList();
        li.add(1);
        li.add(2);
        li.remove(1);
        System.out.println(li);
    }
}
