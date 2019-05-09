//167. Two Sum II - Input array is sorted

//        Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//
//        The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
//
//        Note:
//
//        Your returned answers (both index1 and index2) are not zero-based.
//        You may assume that each input would have exactly one solution and you may not use the same element twice.
//        Example:
//
//        Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
//        Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

package leetcodeeasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {1,2,3,4,4,9,56,90};
//        int[] numbers = {2,7,11,15};
        twoSum.twoSum(numbers, 8);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        list2.add(2);
        list2.add(1);
        System.out.println(list1.equals(list2));


    }

    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for(int i=0; i<numbers.length; i++) {
            if (numbers[i] <= target) {
                for (int j=i+1; j<numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        arr[0] = i+1;
                        arr[1] = j+1;
                        return arr;
                    }
                }
            }
        }

        return arr;

    }
}
