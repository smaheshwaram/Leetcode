//Input: S = "ab#c", T = "ad#c"
//        Output: true
//        Explanation: Both S and T become "ac".
//        Example 2:
//
//        Input: S = "ab##", T = "c#d#"
//        Output: true
//        Explanation: Both S and T become "".
//        Example 3:
//
//        Input: S = "a##c", T = "#a#c"
//        Output: true
//        Explanation: Both S and T become "c".
//        Example 4:
//
//        Input: S = "a#c", T = "b"
//        Output: false
//        Explanation: S becomes "c" while T becomes "b".
package leetcodeeasy;

import java.util.Stack;

public class BackSpaceString {
    public static void main(String[] args) {
        BackSpaceString backSpaceString = new BackSpaceString();
        String s1 = "y#fo##f";
        String s2 = "y#f#o##f";
        backSpaceString.backspaceCompare(s1, s2);
    }

    public boolean backspaceCompare(String S, String T) {
        return createString(S).equals(createString(T));
    }

    private String createString(String S) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(S.charAt(i));
            }
        }
        return String.valueOf(stack);
//        StringBuilder sb = new StringBuilder();
//        while (!stack.isEmpty()) {
//            sb.append(stack.pop());
//        }
//        return sb.reverse().toString();
    }
}
