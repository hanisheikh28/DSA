class Solution {
    public int minSubArrayLen(int target, int[] nums) {
     int left=0;
     int minLenW = Integer.MAX_VALUE;
     int sum =0;
     for(int right=0;right<nums.length;right++){
        sum += nums[right]; 
        while(sum>=target){
            int currW = right-left+1;
            minLenW = Math.min(minLenW,currW);
            sum -= nums[left];
            left++; 
        }
     } return minLenW  ==Integer.MAX_VALUE ? 0 : minLenW ;  
    }
}