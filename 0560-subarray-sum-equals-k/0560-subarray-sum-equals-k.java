class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int cnt = 0;
        int running = 0;
        for (int i = 0; i < nums.length; i++) {
            running += nums[i];
            int dfg = running - k;

            if (map.containsKey(dfg)) {
                cnt += map.get(dfg);
            }
            map.put(running, map.getOrDefault(running, 0) + 1);
        }
        return cnt;
    }
}