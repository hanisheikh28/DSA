import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); // sort in ascending order
        
        int count = 1; // count distinct maximums
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] != nums[i - 1]) { // check for distinct
                count++;
                if (count == 3) { // found 3rd distinct max
                    return nums[i - 1];
                }
            }
        }
        
        // If less than 3 distinct numbers, return the maximum
        return nums[nums.length - 1];
    }
}
