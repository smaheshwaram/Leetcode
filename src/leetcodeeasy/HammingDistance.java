//0 ≤ x, y < 231.
//
//        Example:
//
//        Input: x = 1, y = 4
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

public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        hammingDistance.hammingDistance(1, 4);
    }

    public int hammingDistance(int x, int y) {
        String s1 = Integer.toBinaryString(x);
        String s2 = Integer.toBinaryString(y);
        s2.compareTo(s1);
        
      return 0;
    }
}
