class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> answere = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        BackTrack(nums, used, new ArrayList<>(), answere);
        return answere;
    }
    void BackTrack(int[] arr, boolean[] used, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size() == arr.length){
            ans.add(new ArrayList<>(curr));
        }
        for(int i = 0; i < arr.length; i++){
            if(used[i]){
                continue;
            }
            if(i > 0 && arr[i] == arr[i - 1] && !used[i -1]){
                continue;
            }

            used[i] = true;
            curr.add(arr[i]);

            BackTrack(arr, used, curr, ans);

            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}