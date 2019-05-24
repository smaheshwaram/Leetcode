package leetcodeeasy;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        System.out.println("Is prime: " + checkPrimeNumber.isPrime(17));
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
