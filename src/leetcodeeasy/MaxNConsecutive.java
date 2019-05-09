package leetcodeeasy;

//Find max of n consecutive elements in given array. array is {2,5,3,4,6} and n == 2 then output should be 10 (i.e. 6 + 4).

public class MaxNConsecutive {
    public static void main(String[] args) {
        MaxNConsecutive maxNConsecutive = new MaxNConsecutive();
        int[] arr = {2,5,7,4,1,3,9,12};
        System.out.println(maxNConsecutive.maxNConsecutiveElements(arr, 4));

    }

    private int maxNConsecutiveElements(int[] arr, int n) {

        if (arr.length < n) {
            return -1;
        }
        int max = 0;
        for(int i=0; i+(n-1)<arr.length; i++) {
            int sum =0;
            for(int j=i; j<= i+n-1; j++) {
                sum = sum + arr[j];

                if (max < sum) {
                    max = sum;
                }
            }

        }
        return max;
    }
}
