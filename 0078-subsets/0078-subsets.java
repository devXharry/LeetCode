class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(nums, 0, new ArrayList<>(), result);
        return result;
    }
    void backTrack(int[] nums, int start, List<Integer> curr, List<List<Integer>> result){
        result.add(new ArrayList<>(curr));

        for(int i = start; i < nums.length; i++){
            curr.add(nums[i]);
            backTrack(nums, i + 1, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}