class Solution {
    public long minimalKSum(int[] nums, int k) {
        Set<Integer> numf = new HashSet<>();
        for (int num : nums) {
            numf.add(num);
        }

        List<Integer> sorN = new ArrayList<>(numf);
        Collections.sort(sorN);

        long totalSum = (long) k * (k + 1) / 2;
        long nxtToAppend = k + 1;

        for (int num : sorN) {
            if (num <= nxtToAppend) {
                totalSum -= num;
                totalSum += nxtToAppend;
                nxtToAppend++;
            } else {
                break;
            }
        }
        return totalSum;
    }
}