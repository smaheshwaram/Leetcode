//Input: x = 1, y = 4
//
//        Output: 2
//
//        Explanation:
//        1   (0 0 0 1)
//        4   (0 1 0 0)
//        ↑   ↑
//
//        The above arrows point to positions where the corresponding bits are different.
package leetcodeeasy;

public class FindHammingDistance {
    public static void main(String[] args) {
        FindHammingDistance findHammingDistance = new FindHammingDistance();
        findHammingDistance.hammingDistance(1,4);
    }
    public int hammingDistance(int x, int y) {
        String s1 = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
        String s2 = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
        if (s1.length() != s2.length()) {
            return -1;
        }
        int count = 0;
        for(int i=0; i<s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
        }
        String s = "yuiuorwgh";
        return count;
    }
}
