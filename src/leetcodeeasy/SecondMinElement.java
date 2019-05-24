package leetcodeeasy;

import java.util.Arrays;

//finding second minimum element of given array
public class SecondMinElement {
    public static void main(String[] args) {
        SecondMinElement secondMinElement = new SecondMinElement();
        int[] arr = {28,18,6,79,12,46};
        System.out.println( secondMinElement.findSecMinElement(arr) );
    }

    private int findSecMinElement( int[] arr ) {
        if ( arr.length == 0 || arr.length < 2 ) {
            return -1;
        }
        Arrays.sort( arr );

        return arr[1];
    }
}
