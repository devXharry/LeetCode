class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> comp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            Integer compIndex = comp.get(nums[i]);
            if(compIndex != null){
                return new int[]{i, compIndex};
            }
            comp.put(target - nums[i], i);
        }
        return nums;
    }
}