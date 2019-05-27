package interview.stack;

import java.util.Stack;

public class MinStack {
    private int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(12);
        minStack.push(8);
        minStack.push(6);
        minStack.push(3);

        minStack.pop();

        System.out.println(minStack.getMin());
    }

    private int getMin() {
        return min;
    }

    private void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    private void push(int x) {
        if (x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }
}
