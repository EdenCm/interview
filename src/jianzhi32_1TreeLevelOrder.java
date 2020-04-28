
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class jianzhi32_1TreeLevelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

/*
    分层从上到下打印二叉树，每层元素单独输出
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
            res.add(new ArrayList<>(level));
            level.clear();
        }
        return res;
    }
}

}
