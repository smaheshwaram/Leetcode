//find number of prime numbers exists before for a given number. Eg: given 10, number of prime numbers is 4 before 10.
package leetcodeeasy;

public class NumberOfPrimesForNumber {
    public static void main(String[] args) {
        NumberOfPrimesForNumber numberOfPrimesForNumber = new NumberOfPrimesForNumber();
        System.out.println(numberOfPrimesForNumber.findNumber(10));
    }

    private int findNumber(int num) {
        int count = 0;
        for(int i = 2; i< num; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean isPrime(int n) {
        if (n==1) {return false;}
        //if (n==2) {return true;}
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
