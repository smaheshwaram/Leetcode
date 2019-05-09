package interview.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedChars {
    public static void main(String[] args) {
        BalancedChars balancedChars = new BalancedChars();
        String str = "[({})]";

        System.out.println("Is balance parenthesis: " + balancedChars.isBalanced(str));
    }

    private boolean isBalanced(String str) {
        if (str.isEmpty()) {
            return true;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(' ) {
                stack.push(str.charAt(i));
            }
        }

        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')' ) {
                if (stack.isEmpty()) {
                    return false;
                }
                if ( map.get(stack.pop()) != str.charAt(i)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
