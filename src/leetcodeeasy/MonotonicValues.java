package leetcodeeasy;

public class MonotonicValues {
    public static void main(String[] args) {
        MonotonicValues monotonicValues = new MonotonicValues();

//        int[] arr = {8,4,6,9,12};
        int[] arr = {3,5,9,12};
        monotonicValues.isMonotonicIncreasing(arr);
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
}
