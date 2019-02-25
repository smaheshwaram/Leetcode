package interview;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        //print numbers from 1 to n. Print fizz for multiples of 3 and buzz for multiples of 5 and fizzbuzz for multiples of 3 & 5
        fizzBuzz.print(50);
    }

    private void print(int num) {
        for (int i=1; i<=num; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i%3 == 0) {
                System.out.println("fizz");
            } else if (i%5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
