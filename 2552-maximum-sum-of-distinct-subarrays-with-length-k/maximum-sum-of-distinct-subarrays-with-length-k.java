class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set <Integer> set = new HashSet<>();
      int left=0;
      long sum=0,max=0;

      for(int right=0;right<nums.length;right++){
        while(set.contains(nums[right])||set.size()==k){
            set.remove(nums[left]);
            sum-=nums[left];
            left++;
        }
        sum+=nums[right];
        set.add(nums[right]);
        if(set.size()==k){
            max= Math.max(max,sum);
        }
      }  return max;

    }
}