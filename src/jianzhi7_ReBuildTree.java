import java.util.HashMap;

public class jianzhi7_ReBuildTree {
/*      根据前序遍历与中序遍历，确定二叉树
       输入：前序遍历 preorder = [3,9,20,15,7]
             中序遍历 inorder = [9,3,15,20,7]

       输出：       3
                   / \
                  9  20
                    /  \
                   15   7
 */
    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
    static class Solution {
        private int[] preorder_;
        private int[] inorder_;
        private HashMap<Integer,Integer> root_map ; // 保存根节点在inorder中的位置索引，提高查找效率
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            root_map = new HashMap<>();
            preorder_ = preorder;
            inorder_ = inorder;
            // 遍历中序遍历列表将其值为key，索引为value，加入map中
            for (int i = 0; i < inorder_.length; i++) {
                root_map.put(inorder_[i],i);
            }
            return dfs(0,preorder_.length -1,0,inorder_.length - 1);
        }
        private TreeNode dfs(int pl,int pr,int il,int ir){
            if (pl > pr) return null;
            TreeNode root = new TreeNode(preorder_[pl]);
            // 得到中序遍历中根节点的索引
            int k = root_map.get(root.val);
            root.left = dfs(pl+1,pl+k-il,il,k-1);
            root.right = dfs(pl+k-il+1,pr,k+1,ir);
            return root;
        }
    }
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        Solution solution = new Solution();
        TreeNode treeNode = solution.buildTree(preorder, inorder);
        System.out.println(treeNode.left.val);
    }
}
