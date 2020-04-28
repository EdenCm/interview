public class jianzhi22_KthNodeInLinkNode {
      public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode p = dummy; // 先行节点
            ListNode s = dummy; // 后续节点
            int count = 0;
            while (p.next != null){
                count += 1;
                p = p.next;
                if (count >= k){
                    s = s.next;
                }
            }
            return s;
        }
    }
}
