public class jianzhi18_DelLInkNode {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
//        public ListNode deleteNode(ListNode head, ListNode delNode) {
//
//            // 下个节点的值覆盖当前节点的值
//            delNode.val = delNode.next.val;
//            // 删除下个节点
//            delNode.next =delNode.next.next;
//            return head;
//        }

        public ListNode deleteNode(ListNode head, int val) {

            if (head.val == val && head != null){
                head = head.next;
            }
            ListNode currentNode = head;
            while (currentNode != null){
                if (currentNode.next.val == val){
                    currentNode.next = currentNode.next.next;
                }
            }
            return head;
        }
    }
}
