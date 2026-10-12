class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);

        int low = 0;
        int high = price[price.length - 1] - price[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canMake(price, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    private boolean canMake(int[] price, int k, int target) {
        int count = 1;
        int lastP = price[0];

        for (int i = 1; i < price.length; i++) {
            if (price[i] - lastP >= target) {
                count++;
                lastP = price[i];
            }
        }
        return count >= k;
    }
}