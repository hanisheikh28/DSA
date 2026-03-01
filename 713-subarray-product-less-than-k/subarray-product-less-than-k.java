class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;              // products are positive integers, nothing < 1
        int left = 0;
        int count = 0;
        long product = 1;                  // use long to reduce overflow risk

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k && left <= right) {
                product /= nums[left];
                left++;
            }

            // All subarrays ending at 'right' and starting from any index in [left..right]
            // have product < k. That's (right - left + 1) many subarrays.
            count += (right - left + 1);
        }

        return count;
    }
}