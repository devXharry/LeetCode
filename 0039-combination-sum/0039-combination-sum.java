class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private List<Integer> currCombo = new ArrayList<>();
    private int[] candidates;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.candidates = candidates;

        DFSE(0, target);
        return result;
    }
    private void DFSE(int startIndex, int remainingTarget) {
        if (remainingTarget == 0) {
            result.add(new ArrayList<>(currCombo));
            return;
        }

        if (remainingTarget < candidates[startIndex]) {
            return;
        }

        for (int i = startIndex; i < candidates.length; ++i) {
            currCombo.add(candidates[i]);

            DFSE(i, remainingTarget - candidates[i]);

            currCombo.remove(currCombo.size() - 1);
        }
    }
}