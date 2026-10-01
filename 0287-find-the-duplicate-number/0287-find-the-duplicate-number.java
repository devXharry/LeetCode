class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> gh = new HashMap<>();
        for (int num : nums) {
            gh.put(num, gh.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (int i = 0; i < gh.size(); i++) {
            if (gh.get(nums[i]) > 1) {
                res = nums[i];
            }
        }
        return res;
    }
}