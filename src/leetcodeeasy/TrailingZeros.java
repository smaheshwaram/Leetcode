//Input: 5
//        Output: 1
//        Explanation: 5! = 120, one trailing zero.
package leetcodeeasy;

import java.math.BigInteger;

public class TrailingZeros {

        public static void main(String[] args) {
            TrailingZeros t = new TrailingZeros();
            System.out.print(t.trailingZeroes(2838));
        }

        private int trailingZeroes(int n) {
            int count = 0;
            BigInteger x = BigInteger.valueOf(1);
            for (int i=n; i>0; i--) {
                x = x.multiply(BigInteger.valueOf(i));
            }

            while ( x.compareTo(BigInteger.valueOf(10)) == 1) {
                if (x.mod(BigInteger.valueOf(10)) == BigInteger.valueOf(0)) {
                    count++;
                } else {
                    return count;
                }
                x = x.divide(BigInteger.valueOf(10));
            }
            return count;
        }
}
