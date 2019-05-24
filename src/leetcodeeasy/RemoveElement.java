package leetcodeeasy;

import java.util.Stack;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        removeElement.removeGivenElement( nums, 3);
    }

    private int removeGivenElement(int[] nums, int n) {
        if (nums.length == 0) {
            return -1;
        }

        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != n) {
                stack.push(nums[i]);
            }
        }

        nums = new int[stack.size()];
        int i = 0;

        while(!stack.isEmpty()) {
            nums[i++] = stack.pop();
        }

        return nums.length;

//        int count = 0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i] != n){
//                nums[count++] = nums[i];
//            }
//        }
//        return count;
    }
}
