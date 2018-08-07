//Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//
//        Example 1:
//
//        Input: [3,0,1]
//        Output: 2
//        Example 2:
//
//        Input: [9,6,4,2,3,5,7,0,1]
//        Output: 8
package leetcodeeasy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] nums = {0,1};
        System.out.println(missingNumber.findMissingNumber(nums));
    }

    private int findMissingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1 && nums[0] == 0) {
            return 1;
        } else if (nums.length == 1) {
            return 0;
        }
        for(int i=0; i<nums[nums.length -1]; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums[nums.length - 1] + 1;
    }
}
