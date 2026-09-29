class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        int maxL = 0;
        for (int right = 0; right < n; right++) {
            map1.put(nums[right], map1.getOrDefault(nums[right], 0) + 1);

            while (map1.get(nums[right]) > k) {
                map1.put(nums[left], map1.get(nums[left]) - 1);
                left++;
            }
            maxL = Math.max(maxL, right - left + 1);

        }
        return maxL;
    }
}