package leetcodeeasy;


public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        removeElement.removeGivenElement( nums, 3);
    }

    private int removeGivenElement(int[] nums, int n) {
        int count =0;

        for(int i=0; i<nums.length; i++) {
            if (nums[i] != n) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
