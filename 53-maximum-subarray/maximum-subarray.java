class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // initialize with first element
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // choose either to continue adding or start fresh from current element
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            // update max sum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

