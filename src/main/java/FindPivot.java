import java.util.Arrays;

public class FindPivot {
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int left_sum = 0;
        int right_sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        right_sum = sum;
        for (int i = 0; i < n; i++) {
            left_sum += nums[i];
            if (left_sum == right_sum) {
                return i;
            }
            right_sum -= nums[i];
        }
        return -1;
    }




    public static void main(String[] args) {
        int[] nums ={2,1,-1};
        pivotIndex(nums);
    }
}
