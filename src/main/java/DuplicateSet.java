import java.util.HashSet;
import java.util.Set;

public class DuplicateSet {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(Integer number:nums){
            if(numSet.contains(number)){
                return true;
            }
            numSet.add(number);
        }
        return false;
    }





}
