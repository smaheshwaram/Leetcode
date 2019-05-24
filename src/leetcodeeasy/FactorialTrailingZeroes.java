package leetcodeeasy;

import java.math.BigInteger;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        factorialTrailingZeroes.trailingZeroes( 13 );
        factorialTrailingZeroes.trailingZeroes1( 13 );
    }

    //optimized solution
    private int trailingZeroes1(int n) {
        int count = 0, p = 1;
        while ( n >= Math.pow( 5, p ) ) {
            count += n / Math.pow( 5, p );
            p++;
        }
        return count;
    }

    public int trailingZeroes(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }

        BigInteger bigInteger = new BigInteger( String.valueOf(n) );

        while(n != 1) {
            bigInteger = bigInteger.multiply( new BigInteger( String.valueOf( n-1 ) ) );
            n--;
        }

        String s = bigInteger.toString();
        System.out.println(s);

       return findVal(s);
    }

    private int findVal(String s) {
        int count = 0;

        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt( i ) == '0') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
