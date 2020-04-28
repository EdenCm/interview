import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Stack;

public class jianzhi30_MinStack {

    static class MinStack {
        private Stack<Integer> stk;
        private Stack<Integer> min_stk; // 辅助最小栈

        @Override
        public String toString() {
            return "MinStack{" +
                    "stk=" + stk +
                    ", min_stk=" + min_stk +
                    '}';
        }

        /** initialize your data structure here. */
        public MinStack() {
            this.stk = new Stack<>();
            this.min_stk = new Stack<>();
        }

        public void push(int x) {
            stk.push(x);
            if (min_stk.size()== 0 || min_stk.peek() >= x) min_stk.push(x);
        }

        public void pop() {
//            if (stk.peek() == min_stk.peek()) min_stk.pop();// LeetCode不通过
            if (stk.peek().equals(min_stk.peek())) min_stk.pop();
            stk.pop();
        }

        public int top() {
            return stk.peek();
        }

        public int min() {
            return min_stk.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        System.out.println(minStack.toString());
        System.out.println("删除栈顶元素");
        minStack.pop();
        System.out.println(minStack.toString());
        System.out.println("栈中最小元素"+minStack.min());
        System.out.println("删除栈顶元素");
        minStack.pop();
        System.out.println(minStack.toString());
        System.out.println("栈中最小元素"+minStack.min());
        System.out.println("删除栈顶元素");
        minStack.pop();
        System.out.println(minStack.toString());
        System.out.println("栈中最小元素"+minStack.min());
//        System.out.println("栈顶元素"+minStack.top());


    }

}
