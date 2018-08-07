//Example 1:
//        Input: 5
//        Output: True
//        Explanation:
//        The binary representation of 5 is: 101
//Example 2:
//        Input: 7
//        Output: False
//        Explanation:
//        The binary representation of 7 is: 111.
package leetcodeeasy;

public class AlternatingBits {
    public static void main(String[] args) {
        AlternatingBits alternatingBits = new AlternatingBits();
        alternatingBits.hasAlternatingBits(7);
    }
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);
        if (s.isEmpty()) {
            return false;
        }
        if (s.length() == 1) {
            return true;
        }
        for(int i=1; i<s.length(); i++) {
            if (s.charAt(i-1) == s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
