package leetcodeeasy;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        checkPrimeNumber.isPrime(49);
    }
    private boolean isPrime(int n) {
        if (n < 2) { return false; }
        if (n == 2) {return true; }
        for(int i= 2; i<= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
