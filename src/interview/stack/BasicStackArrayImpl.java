package interview.stack;

import java.util.Stack;

public class BasicStackArrayImpl {
    private static final int MAX = 1000;
    int top;
    int[] arr =  new int[MAX];

    BasicStackArrayImpl() {
        top = -1;
    }

    public static void main(String args[])
    {
        BasicStackArrayImpl s = new BasicStackArrayImpl();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }

    boolean isEmpty() {
        return top < 0;
    }

    int peek() {
        return top;
    }

    boolean push(int x) {
        if (top > MAX - 1) {
            System.out.println("Stack over flow");
            return false;
        }
        else {
            arr[++top] = x;
            System.out.println("Pushed " + x + " inti stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        else {
            int x = arr[--top];
            System.out.println("Popped a value from stack");
            return x;
        }
    }
}
