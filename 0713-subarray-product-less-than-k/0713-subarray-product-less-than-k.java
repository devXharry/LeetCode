class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int cnt = 0;
        if (k <= 1) {
            return 0;
        }
        int left = 0;
        int pro = 1;
        for (int right = 0; right < nums.length; right++) {
            pro *= nums[right];

            while (pro >= k) {
                pro /= nums[left];
                left++;
            }

            cnt += right - left + 1;
        }
        return cnt;
    }
}