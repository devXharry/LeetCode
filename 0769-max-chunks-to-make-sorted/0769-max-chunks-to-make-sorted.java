class Solution {
    public int maxChunksToSorted(int[] arr) {
        int mx = 0;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            mx = Math.max(mx, arr[i]);
            if (i == mx) {
                ans++;
            }
        }
        return ans;
    }
}