import org.omg.CORBA.NO_IMPLEMENT;

public class LeetCode_SortLinkList {

    // 主函数，用来测试
    public static void main(String[] args) {
        Node head = new Node(5);
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(1);
        Node n5 = new Node(7);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        head.print();
        Solution solution = new Solution();
        solution.mergeSort(head).print();
    }

    static class Solution {

        public Node mergeSort(Node head){
            if (head == null) return null;
            if (head.next == null) return head;
            Node midNode = findMidNode(head);

           return merge(mergeSort(head),mergeSort(midNode));
        }

        public Node merge(Node p1,Node p2){

            Node dummy = new Node(-1);
            Node p = dummy;

            while (p1 != null && p2 != null){
                if (p1.val <= p2.val){
                    p.next = p1;
                    p1 = p1.next;
                }else{
                    p.next = p2;
                    p2  = p2.next;
                }
                p = p.next;
            }
            if (p1 != null){
                p.next = p1;
            }
            if (p2 != null){
                p.next = p2;
            }
            return dummy.next;
        }

        public Node findMidNode(Node head){
            Node fast = head;
            Node slow = head;
            while (fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node midNode = slow.next;
            slow.next = null;
            return midNode;
        }
    }
    static class Node{

        private Integer val;
        private Node next;

        public Node(Integer val) {
            this.val = val;
            this.next = null;
        }

        public void print(){
            Node head = this;
//            if (head == null) return;
            while (head != null){
                if (head.next == null){
                    System.out.println(head.val);
                }else {
                    System.out.print(head.val + "-> ");
                }
                head = head.next;
            }
        }

    }


}
