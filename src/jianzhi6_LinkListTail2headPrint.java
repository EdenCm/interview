import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.List;
public class jianzhi6_LinkListTail2headPrint {


//     * Definition for singly-linked list.
     public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    // 从尾至头打印链表
    static class Solution {
        public int[] reversePrint(ListNode head) {

            Stack<Integer> stack = new Stack<>();
            ListNode currentNode =head;
            while (currentNode != null){
//                System.out.println(currentNode.val);
                stack.push(currentNode.val);
                currentNode = currentNode.next;
            }
            int [] ret = new int[stack.size()];
            for (int i = 0; i < ret.length; i++) {
//                System.out.println(stack.peek());
                ret[i] = stack.pop();
            }
            return ret;
        }

    }

    public static void main(String[] args) {
        Solution solution  = new Solution();
        ListNode head = new ListNode(1);
        head.next= new ListNode(2);
        head.next.next= new ListNode(3);
        int[] ret = solution.reversePrint(head);
        System.out.println(Arrays.toString(ret));
    }
}
