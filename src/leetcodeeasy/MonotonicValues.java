package leetcodeeasy;

public class MonotonicValues {
    public static void main(String[] args) {
        MonotonicValues monotonicValues = new MonotonicValues();

//        int[] arr = {8,4,6,9,12};
        int[] arr = {3,5,9,12};
        monotonicValues.isMonotonicIncreasing(arr);
        monotonicValues.isMonotonic(arr);
    }

    public boolean isMonotonicIncreasing(int[] arr) {
        if (arr.length < 1) {
            return false;
        }

        int ref = arr[0];

        for(int i=1; i<arr.length; i++) {
            if (arr[i] < ref) {
                return false;
            }

            ref = arr[i];
        }
        return true;
    }


    /*
        An array is monotonic if it is either monotone increasing or monotone decreasing.

    An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

    Return true if and only if the given array A is monotonic.

    Example 3:
    Input: [1,3,2]
    Output: false

    Example 4:
    Input: [1,2,4,5]
    Output: true

    Example 5:
    Input: [1,1,1]
    Output: true

     */

    public boolean isMonotonic(int[] A) {
        if (A.length == 0 || A.length == 1) {
            return true;
        }

        boolean asc = false;
        boolean desc = false;

        for(int i=1; i<A.length; i++) {

            if (A[i-1] < A[i]) {
                if (!desc) {
                    asc = true;
                } else {
                    return false;
                }

            }

            else if (A[i-1] > A[i]) {
                if (!asc) {
                    desc = true;
                } else {
                    return false;
                }
            }

        }

        return true;
    }
}
