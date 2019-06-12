package leetcodeeasy;

import interview.binarytree.HeightOfTree;

import java.util.Arrays;
import java.util.HashMap;
/*
Students are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students not standing in the right positions.  (This is the number of students that must move in order for all students to be standing in non-decreasing order of height.)



Example 1:

Input: [1,1,4,2,1,3]
Output: 3
Explanation:
Students with heights 4, 3 and the last 1 are not standing in the right positions.
 */

public class HeightChecker {

    public static void main(String[] args) {
        HeightChecker heightChecker = new HeightChecker();
        int[] heights = {1,1,4,2,1,3};
        heightChecker.heightChecker(heights);
    }

    public int heightChecker(int[] heights) {
        if (heights.length < 1) {
            return -1;
        }
        int[] temp = new int[heights.length];

        for(int i=0; i<heights.length; i++) {
            temp[i] = heights[i];
        }

        Arrays.sort(heights);
        int count = 0;

        for(int i=0; i<heights.length; i++) {
            if (temp[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }
}
