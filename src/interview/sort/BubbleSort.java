package interview.sort;

/** works by repeatedly swapping the adjacent elements if they are in wrong order.
 * Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
 *
 * Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
 *
 * Auxiliary Space: O(1)
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] arr = {8,4,9,5,6,12,6,35,1};

        bubbleSort.sort(arr);

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    // not completely optimized because it loops even no swapping occured or elements are already sorted
    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    //optimized function
    private void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

}
