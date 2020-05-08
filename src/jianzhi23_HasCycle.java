public class jianzhi23_HasCycle {
      class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
      }

    /**
     * 判断链表是否有环
     */
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (true){
                if ( fast == null || fast.next == null ) return null;
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast){
                    break;
                }
            }
            fast = head;
            while (fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
    }
}
