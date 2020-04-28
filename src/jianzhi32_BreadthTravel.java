import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.List;
public class jianzhi32_BreadthTravel {
// * Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    class Solution {
        public int[] levelOrder(TreeNode root) {
            if (root == null) return null;
            ArrayList<Integer> res_list = new ArrayList<>();
            Queue<TreeNode> queue = new ConcurrentLinkedQueue<>();
            queue.add(root);
            while (queue.size() != 0){
                TreeNode node = queue.poll();
                res_list.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            int[] res = new int[res_list.size()] ;
            for (int i = 0; i < res_list.size(); i++) {
                res[i] = res_list.get(i);
            }
            int[] a;
            Object[] b = res_list.toArray();
            System.out.println(b);
            return res;
        }
    }
}
