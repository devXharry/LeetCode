class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> newS = new HashSet<>();

        for (int num : nums) {
            newS.add(num);
        }

        int longSt = 0;

        for (int num : newS) {
            if (!newS.contains(num - 1)) {
                int curN = num;
                int currnS = 1;

                while (newS.contains(curN + 1)) {
                    curN++;
                    currnS++;
                }

                longSt = Math.max(longSt, currnS);
            }
        }
        return longSt;
    }
}