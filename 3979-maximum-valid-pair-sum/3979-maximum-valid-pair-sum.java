class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;
        int maxLeft = nums[0];
        int maxSum = Integer.MIN_VALUE;

        for(int j = k; j < n; j++){
            int i = j - k;
            maxLeft = Math.max(maxLeft, nums[i]);

            int currSum = maxLeft + nums[j];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}