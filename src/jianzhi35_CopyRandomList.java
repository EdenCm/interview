public class jianzhi35_CopyRandomList {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class Solution {
        public Node copyRandomList(Node head) {
            if(head == null) return null;
            // 1.在每个点后面接个复制点
            for(Node p = head ; p != null;){
                Node np = new Node(p.val);
                Node next = p.next;
                p.next = np;
                np.next = next;
                p = next;
            }
            // 2.继续遍历一遍，将random指针复制好
            for (Node p = head; p != null;p= p.next.next){
                if (p.random != null){
                    p.next.random = p.random.next;
                }
            }
            // 3.将复制点分离出来 ，串起来
//            Node dummy = new Node(-1);
//            Node cur = dummy;
//
//            for (Node p = head;p!= null;p = p.next){
//                cur.next = p.next;
//                cur = cur.next;
//                p = p.next;
//            }
//            return dummy.next;

            Node  node = head;
            Node res = head.next;
            while(node.next != null){
                Node temp = node.next;
                node.next = node.next.next;
                node = temp;
            }
            return res;
        }
    }


}


