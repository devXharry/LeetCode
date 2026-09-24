class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int mask = 0;
        int maxLength = 0;

        while (right < nums.length) {
            
            while ((mask & nums[right]) != 0) {
                mask ^= nums[left];
                left++;            
            }
            
            
            mask |= nums[right];
            
            maxLength = Math.max(maxLength, right - left + 1);
            
            
            right++;
        }
        
        return maxLength;
    }
}