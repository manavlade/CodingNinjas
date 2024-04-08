package Reccurssion;

import java.util.Stack;

public class Question2 {
    /*
     * Question
     * Reverse a given stack of 'N' integers using recursion. You are required to
     * make changes in the input parameter itself.
     * Note: You are not allowed to use any extra space other than the internal
     * stack space used due to recursion.
     * Example:
     * Input: [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     */
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, top);
    }

    private static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);

    }
}
