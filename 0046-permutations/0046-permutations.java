class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        BackTrack(nums, used, new ArrayList<>(), ans);
        return ans;
    }
    void BackTrack(int[] arr, boolean[] used, List<Integer> curr, List<List<Integer>> res){
        if(curr.size() == arr.length){
            res.add(new ArrayList<>(curr));
        }
        for(int i = 0; i < arr.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            curr.add(arr[i]);

            BackTrack(arr, used, curr, res);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}