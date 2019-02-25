package interview;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        //print fibonacci upto 100 elements
        fibonacci.printFibonacci(100);

        //calling recursive fibonacci
        fibonacci.recursiveFibonacci(1, 1, 2);
    }

    private void printFibonacci(int num) {
        int n1 = 1;
        int n2 = 1;
        int n3 = 1;
        System.out.println(n1);
        System.out.println(n2);
        while(n3 < num) {
            n3 = n1 + n2;
            if (n3 <= num) {
                System.out.println(n3);
            }
            n1 = n2;
            n2 = n3;
        }
    }

    private int recursiveFibonacci(int n1, int n2, int n3) {
        if (n2 == 1) {
            System.out.println(n1);
            System.out.println(n2);
        }
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        if (n3 > 100) {
            return -1;
        } else {
            System.out.println(n3);
            recursiveFibonacci(n1, n2, n3);
        }
        return -1;
    }
}
