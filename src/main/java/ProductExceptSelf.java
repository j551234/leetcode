public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int initLeft = 1;
        int initRight = 1;
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        int [] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            initLeft = initLeft * nums[i];
            initRight = initRight * nums[i];
            ans[0] = initLeft * initRight;

        }

        return ans;
    }

    public static void main(String[] args) {
   int[]     nums = {-1,1,0,-3,3};
      int[] ans =   productExceptSelf(nums);
        System.out.println(ans);
    }


}
