package leetcodeeasy;
/*
Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.



Example 1:

Input: "abbaca"
Output: "ca"
Explanation:
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

 */

public class AdjacentDuplicates {

    public static void main(String[] args) {

        AdjacentDuplicates adjacentDuplicates = new AdjacentDuplicates();
        System.out.println("Result string = " + adjacentDuplicates.removeDuplicates("abbacab"));
    }


    public String removeDuplicates(String S) {
        if (S.isEmpty() || S.length() == 1) {
            return S;
        }
        StringBuilder sb = new StringBuilder(S);
        for(int i=1; i<sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i-1)) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i = 0;
            }
        }
        return sb.toString();

    }
}
