package interview.search;

//time complexity is O(n), best case is O(1)
public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {30, 8, 12, 6, 21, 24, 14};

        //finding index of given number in an array
        linearSearch.search(arr, 12);
    }

    private int search(int[] arr, int num) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }
}
