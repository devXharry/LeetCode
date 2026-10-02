class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> remainMap = new HashMap<>();
        remainMap.put(0, -1);

        int runSum = 0;

        for (int i = 0; i < nums.length; i++) {
            runSum += nums[i];

            int remainder = k == 0 ? runSum : runSum % k;

            if (remainMap.containsKey(remainder)) {
                if (i - remainMap.get(remainder) >= 2) {
                    return true;
                }
            } else {
                remainMap.put(remainder, i);
            }
        }
        return false;
    }
}