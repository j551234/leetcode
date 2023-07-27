import java.util.Date;

public class MaximumSubstring {

    public static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for(int i=0;i<k;i++) {
            windowSum+=nums[i];
        }
        int max=windowSum;
        for(int i=k;i<nums.length;i++){
            windowSum-=nums[i-k];
            windowSum+=nums[i];
            if(max<windowSum) {
                max=windowSum;
            }
        }
        return max/(k*1.0d);
    }

    public static void main(String[] args) {
//       int [] nums = {1,12,-5,-6,50,3};
//       int k = 4;

        int[] nums ={0};
        int k =1;
       Double ans = findMaxAverage(nums,k);
        System.out.println(ans);
    }

}
