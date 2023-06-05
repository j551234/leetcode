import java.util.Arrays;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low<=high) {
           int  middle=low+(high-low)/2;
            int testMiddle = nums[middle];
            if(testMiddle == target){
                return  middle;
            }

            if (testMiddle  >target){
                high = middle -1;
            }
            if( testMiddle < target){
                low = middle +1;

            }

        }
        return -1;
    }
}
