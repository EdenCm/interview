public class jianzhi25_MergeTwoLInkLIst {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;


            // 诶个比较两个链表的值
            ListNode dummy = new ListNode(0);
            ListNode currentNode = dummy;
            while (l1 != null && l2 != null){
                if (l1.val <= l2.val){
                    currentNode.next = l1;
                    currentNode = currentNode.next;
                    l1 = l1.next;
                }else {
                    currentNode.next = l2;
                    currentNode = currentNode.next;
                    l2 = l2.next;
                }
            }
            if (l2 == null) currentNode.next = l1;
            if (l1 == null)  currentNode.next = l2;
            return dummy.next;
        }
    }
}
