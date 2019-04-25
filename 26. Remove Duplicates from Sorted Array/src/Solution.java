class Solution {
    public int removeDuplicates(int[] nums) {
        int real = 0 ; 
    for(int i=0;i<nums.length;i++)
    {    if(nums[i]>nums[real])
            real++;
            nums[real] = nums[i];
            
    }
    return real+1;    
    }
}