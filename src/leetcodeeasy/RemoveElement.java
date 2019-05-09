package leetcodeeasy;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {3, 2, 2, 0, 3, 1};
        removeElement.removeGivenElement( nums, 2);
    }

    private int removeGivenElement(int[] nums, int n) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == n) {
                if (i+1 < nums.length) {

                }
            }
        }
       return -1;
    }
}
