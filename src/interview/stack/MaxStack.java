package interview.stack;

import java.util.Stack;

public class MaxStack {
    private int max = Integer.MIN_VALUE;
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(5);
        maxStack.push(12);
        maxStack.push(6);
        maxStack.push(14);
        maxStack.push(9);

        maxStack.pop();

        System.out.println(maxStack.getMax());
    }

    private int getMax() {
        return max;
    }

    private void pop() {
        if (stack.pop() == max) {
            max = stack.pop();
        }
    }

    private void push(int x) {
        if (x >= max) {
            stack.push(max);
            max = x;
        }
        stack.push(x);
    }
}
