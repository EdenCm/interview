
import java.util.*;

public class jianzhi32_2TreeZhiPrint {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    /*
    之字型打印数组
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            // 对根节点进行非空判定
            if (root == null) return res;

            // 建立遍历队列
            Queue<TreeNode> queue = new LinkedList<>();
            // 将根节点加入队列
            queue.add(root);
            // 定义每层数组
            List<Integer> level = new ArrayList<>();
            boolean zigzag = true;
            while (!queue.isEmpty()){
//            for (int i = 0; i < queue.size(); i++) { // 错误做法
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    level.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
//            res.add(level);// 错误做法 重新新建一个列表
                if (zigzag) {
                    res.add(new ArrayList<>(level));
                    zigzag = false;
                }
                else {
                    Collections.reverse(new ArrayList<>(level));
                    res.add(level);
                    zigzag = true;
                }
                level.clear();
            }
            return res;
        }
        }
    }

