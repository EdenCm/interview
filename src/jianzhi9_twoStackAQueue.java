import java.util.Stack;

public class jianzhi9_twoStackAQueue {

    class CQueue {
        private Stack<Integer> stack1 ;
        private Stack<Integer> stack2 ;

        public CQueue() {
            this.stack1 = new Stack<>();
            this.stack2 = new Stack<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }
        public int deleteHead() {
            if (stack2.size() == 0 || stack2 == null){
                if (stack1.size() == 0 || stack1== null) {
                    throw new NullPointerException("queue is null");
                }
                for (int i = 0; i < stack1.size(); i++) {
                    stack2.push(stack1.pop());
                }
            }
           return stack2.pop();
        }
    }
}
