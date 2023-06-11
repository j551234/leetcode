public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int num : nums) {

            // keep the origin order
            if (num != 0) {
                nums[i] = num;
                i++;
            }

        }
        // complete else with zero in the end
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
