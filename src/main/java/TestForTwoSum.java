import java.util.HashMap;

public class TestForTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int [] ansArray = new int[2];
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ansArray[0] = i;
            valueMap.put(nums[i],i);
            int valueCheck = target- nums[i];
            if(i!=0 && valueMap.containsKey(valueCheck)){
                ansArray[1]= valueMap.get(valueCheck);
            }
        }

        return ansArray ;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(twoSum(nums, target));

    }
}
