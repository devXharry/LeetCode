class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);

        return countLessEqual(nums, upper) - countLessEqual(nums, lower - 1);
    }
    public long countLessEqual(int[] nums, int target) {
        long count = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] <= target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}