//Input: [1,1,0,1,1,1]
//        Output: 3
//        Explanation: The first two digits or the last three digits are consecutive 1s.
//        The maximum number of consecutive 1s is 3.
package leetcodeeasy;

import java.util.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1, 0, 1, 1, 1, 1, 0};
        //int[] nums = {0};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        String str = "ythgy";
        str.substring(1, 4);
        if (str.substring(0).equalsIgnoreCase("a") || str.substring(0).equalsIgnoreCase("e")) {

        }
        if (str.startsWith("Y")) {
            System.out.println("***");
        }
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        String s = "";
        for(int i=0; i<nums.length; i++) {
            s += String.valueOf(nums[i]);
        }
        String str[] = s.split("0");
        if (str.length == 0) {
            return 0;
        }
        Arrays.sort(str);
        return str[str.length-1].length();
    }
}
