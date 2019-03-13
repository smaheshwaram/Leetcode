package leetcodeeasy;
/*
5!= 5*4*3*2*1
 */

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int n = 5;
        System.out.println("Factorial value is: " + factorial.findFactorial(n));
        System.out.println("Factorial recursive value is: " + factorial.findRecursiveFactorial(n));
    }

    //iterative way of finding factorial
    private int findFactorial(int n) {
        int prod = 1;
        for (int i = n; i > 0; i--) {
            prod = prod * i;

        }
        return prod;
    }

    //recursive factorial
    private int findRecursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * findRecursiveFactorial(n - 1);
    }

    public static void printPascal(int n) {
// An auxiliary array to store generated pascal triangle values
        int[][] arr = new int[n][n];

// Iterate through every line and print integer(s) in it
        for (int line = 0; line < n; line++) {
            // Every line has number of integers equal to line number
            for (int i = 0; i <= line; i++) {
                // First and last values in every row are 1
                if (line == i || i == 0) {
                    arr[line][i] = 1;
                }
                else {// Other values are sum of values just above and left of above
                    arr[line][i] = arr[line - 1][i - 1] + arr[line - 1][i];
                }
                System.out.print(arr[line][i]);
            }
            System.out.println("");
        }
    }
}
