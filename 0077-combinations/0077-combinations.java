class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answere = new ArrayList<>();
        backTrack(1, n, k, new ArrayList<>(), answere);
        return answere;
    }
    void backTrack(int start, int n, int k, List<Integer> curr, List<List<Integer>> res){
        if(curr.size() == k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i <= n; i++){
            curr.add(i);
            backTrack(i + 1, n, k, curr, res);
            curr.remove(curr.size() - 1);

        }
    }
}