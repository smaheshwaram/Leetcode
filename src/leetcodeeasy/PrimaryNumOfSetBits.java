//Input: L = 6, R = 10
//        Output: 4
//        Explanation:
//        6 -> 110 (2 set bits, 2 is prime)
//        7 -> 111 (3 set bits, 3 is prime)
//        9 -> 1001 (2 set bits , 2 is prime)
//        10->1010 (2 set bits , 2 is prime)
//        Example 2:
//
//        Input: L = 10, R = 15
//        Output: 5
//        Explanation:
//        10 -> 1010 (2 set bits, 2 is prime)
//        11 -> 1011 (3 set bits, 3 is prime)
//        12 -> 1100 (2 set bits, 2 is prime)
//        13 -> 1101 (3 set bits, 3 is prime)
//        14 -> 1110 (3 set bits, 3 is prime)
//        15 -> 1111 (4 set bits, 4 is not prime)
package leetcodeeasy;

public class PrimaryNumOfSetBits {
    public static void main(String[] args) {
        PrimaryNumOfSetBits primaryNumOfSetBits = new PrimaryNumOfSetBits();
        System.out.println(primaryNumOfSetBits.countPrimeSetBits(990, 1048));
    }

    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for(int i=L; i<=R; i++) {
            String s = Integer.toBinaryString(i);
            if (countSetBits(s)) {
                count++;
            }
        }
        return count;
    }

    public boolean countSetBits(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        return isPrime(count);
    }

    public boolean isPrime(int count) {
        if (count == 1) {
            return false;
        }
        if (count == 2) { return true; }
        if (count % 2 == 0) {
            return false;
        }
        for (int i=3; i<=Math.sqrt(count); i++) {
            if (count % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Efficient way of coding
//    public int countPrimeSetBits(int L, int R) {
//        int count = 0;
//        for (int i=L;i<=R;i++){
//            int bitCount = Integer.bitCount(i);
//            if (bitCount==2||bitCount==3||bitCount==5||bitCount==7||bitCount==11||bitCount==13||bitCount==17||bitCount==19){
//                count++;
//            }
//        }
//        return count;
//    }
}
