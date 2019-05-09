package interview.search;

import java.util.Arrays;

//find index of given number
public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {30, 8, 12, 6, 21, 24, 14};
        //sort the given array
        Arrays.sort(arr);

        //print sorted array
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Index of searched value is: " + binarySearch.binarySearch(arr, 0, arr.length-1, 21));

        System.out.println("Index of recursive search value is: " + binarySearch.recursiveSearch(arr, 0, arr.length-1, 21));
    }

    private int binarySearch(int arr[], int low, int high, int key) {

        while(low <= high) {

            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int recursiveSearch(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;

        if (low > high) {
            return -1;
        }
        if (arr[mid] < key) {
            return recursiveSearch(arr, mid + 1, high, key);
        } else if (arr[mid] > key) {
            return recursiveSearch(arr, low, mid - 1, key);
        } else {
            return mid;
        }
    }
}
