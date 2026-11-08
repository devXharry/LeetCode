class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }

        int minR = 0;
        for (int com : map.values()) {
            if (com == 1) {
                return -1;
            }
            minR += com / 3 + (com % 3 == 0 ? 0 : 1);
        }
        return minR;
    }
}