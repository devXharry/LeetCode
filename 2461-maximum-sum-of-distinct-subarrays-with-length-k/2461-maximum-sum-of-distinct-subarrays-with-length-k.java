class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long sumC = 0;
        long maxS = 0;
        int left = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sumC -= nums[left];
                left++;
            }

            set.add(nums[right]);
            sumC += nums[right];

            if ((right - left + 1) > k) {
                set.remove(nums[left]);
                sumC -= nums[left];
                left++;
            }

            if((right - left + 1) == k){
                maxS = Math.max(maxS, sumC);
            }
        }
        return maxS;
    }
}