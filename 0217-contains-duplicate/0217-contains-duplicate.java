class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        if (nums == null || nums.length == 0) {
            result = false;
        }
        Set<Integer> duSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!duSet.contains(nums[i])) {
                duSet.add(nums[i]);
            } else {
                result = true;
            }
        }
        return result;
    }
}