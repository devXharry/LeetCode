class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int cnt = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            long curSum = 0;
            for (int j = i; j < n; j++) {
                curSum += nums[j];

                if (curSum % 10 == x) {
                    long firstD = curSum;
                    while (firstD >= 10) {
                        firstD /= 10;
                    }
                    if (firstD == x) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}