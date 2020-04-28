public class jianzhi18_1DelDuplication {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
/*
删除排序链表中的重复节点


 */
    public class solution {
        public ListNode deleteDuplicates(ListNode head){

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode p = dummy;
            // 重复元素是一段元素
            while (p.next != null) {
                ListNode q = p.next;
                while (q != null && p.next.val == q.val) q = q.next;

                // 判断p与q之间距离为1 ，即此时无重复元素
                if (p.next.next == q) p = p.next;
                else p.next = q;
            }
            return dummy.next;
        }


    }
}
