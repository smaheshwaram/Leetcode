package interview.sort;

/** puts min after every loop. Time complexity is O(n2)
 * arr[] = 64 25 12 22 11
 *
 * // Find the minimum element in arr[0...4]
 * // and place it at beginning
 * 11 25 12 22 64
 *
 * // Find the minimum element in arr[1...4]
 * // and place it at beginning of arr[1...4]
 * 11 12 25 22 64
 *
 * // Find the minimum element in arr[2...4]
 * // and place it at beginning of arr[2...4]
 * 11 12 22 25 64
 *
 * // Find the minimum element in arr[3...4]
 * // and place it at beginning of arr[3...4]
 * 11 12 22 25 64
 *
 * Auxiliary Space: O(1)
 * The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.
 */

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {64,25,12,22,11};

        selectionSort.selectionSort(arr);
    }

    private int[] selectionSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int min = i;

            for(int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
