public class SumForArray {
    public int[] runningSum(int[] nums) {
        int nowSum = 0;
        for(int i = 0 ; i < nums.length;i++){
            nowSum+= nums[i];
            nums[i]= nowSum;

        }
        return nums;
    }

}
