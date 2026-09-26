class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int Zcnt = 0;
        int maxL = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                Zcnt++;
            }

            while (Zcnt > k) {
                if (nums[left] == 0) {
                    Zcnt--;
                }
                left++;
            }
            maxL = Math.max(maxL, right - left + 1);
        }
        return maxL;
    }
}