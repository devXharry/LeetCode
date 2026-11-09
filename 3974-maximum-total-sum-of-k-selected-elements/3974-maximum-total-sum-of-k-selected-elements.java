class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);

        long totalSum = 0;
        int n = nums.length;

        int curIndex = n - 1;
        while (k > 0 && curIndex >= 0 && mul > 1) {
            totalSum += (long) nums[curIndex] * mul;
            mul--;
            curIndex--;
            k--;
        }

        while (k > 0 && curIndex >= 0) {
            if (mul > 0) {
                totalSum += (long) nums[curIndex] * mul;
                mul--;
            } else {
                totalSum += nums[curIndex];
            }
            k--;
            curIndex--;
        }
        return totalSum;
    }
}