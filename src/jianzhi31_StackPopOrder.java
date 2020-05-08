import java.util.Stack;

public class    jianzhi31_StackPopOrder {

    // 栈的压入弹出序列
    // stack 1,2,3,4,5 弹出 4,5,3,2,1
    /*
    共两项操作
    1. 将pushed下个元素压入栈
    2. 将栈顶元素弹出
        判断当前栈顶元素与和下一个要输出的数是一样的
        情况一：一样，则弹出当前栈顶元素
        情况二：不一样，将输入序列的下个元素继续压栈
     */
    static class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            // 如果两个序列长度不相同，返回false
            if (pushed.length != popped.length) return false;
            Stack<Integer> stk = new Stack<>();
            int j = 0;
            for (int i = 0; i < pushed.length; i++) {
                // 遍历所有pushed列表，将其压入栈中
                stk.push(pushed[i]);
                // 一旦栈顶元素相同，和栈不为空则
                while (stk.size() != 0 && stk.peek() == popped[j]){
                    stk.pop();
                    j += 1;
                }
            }
            return stk.empty();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] pushed = {1,2,3,4,5},poped = {4,5,3,2,1};
        System.out.println(solution.validateStackSequences(pushed,poped));
    }
}
