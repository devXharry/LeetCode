class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer, Integer> gh = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            gh.put(nums[i], i);
        }

        for(int i = 0; i<operations.length;i++){
            int oldVal = operations[i][0];
            int newVal = operations[i][1];

            int index = gh.get(oldVal);

            nums[index] = newVal;

            gh.put(newVal, index);
            gh.remove(oldVal);
        }
        return nums;
    }
}