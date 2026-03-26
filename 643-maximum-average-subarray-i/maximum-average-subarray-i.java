class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        
        // Sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;
        
        // Slide the window
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i]; // remove left, add right
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum / k; // return average
    }
}