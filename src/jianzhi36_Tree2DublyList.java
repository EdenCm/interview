
public class jianzhi36_Tree2DublyList {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    class Solution {
        private Node head = null; // 定义链表头结点
        private Node tail = null; // 定义链表尾节点
        public Node treeToDoublyList(Node root) {
            if (root == null) return null;

            searchLDR(root);

            tail.right = head;
            head.left = tail;
            return head;
        }

        public void searchLDR(Node root){
            if (root.left != null) {
                searchLDR(root.left);
            }
            if (tail == null){ // 中序遍历的第一个节点
                tail = root;
                head = root;
            }else {
                tail.right = root; // 链表尾节点的后驱指向
                root.left = tail;// 新节点前驱只想你链表尾节点
                tail = root;
            }

            if (root.right != null){
                searchLDR(root.right);
            }
        }
    }
}
