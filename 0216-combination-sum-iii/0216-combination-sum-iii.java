class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backTrack(1, k, n, new ArrayList<>(), result);
        return result;
    }
    private void backTrack(int start, int k, int remain, List<Integer> curr, List<List<Integer>> res){
        if(curr.size() == k){
            if(remain == 0){
                res.add(new ArrayList<>(curr));
            }
            return;
        }
        int needed = k - curr.size();
        for(int i = start; i <= 9; i++){
            if(9 - i + 1 < needed){
                break;
            }
            if(i > remain){
                break;
            }
            curr.add(i);
            backTrack(i + 1, k, remain - i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}