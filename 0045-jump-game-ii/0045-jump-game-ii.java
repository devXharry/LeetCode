class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;
        int currentEnd = 0;
        int jumpCount = 0;
        if (nums == null || n <= 1) {
            return 0;
        }
        for (int i = 0; i < n; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);

            if (i == currentEnd) {
                jumpCount++;
                currentEnd = maxReach;

                if (currentEnd >= n - 1) {
                    break;
                }
            }
        }

        return jumpCount;
    }
}