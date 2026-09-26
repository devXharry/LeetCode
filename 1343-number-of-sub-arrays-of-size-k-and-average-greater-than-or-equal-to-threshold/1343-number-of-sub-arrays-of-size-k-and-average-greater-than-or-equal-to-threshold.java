class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int MaxSum = threshold * k;
        int count = 0;
        int curSum = 0;
        for (int i = 0; i < k; i++) {
            curSum += arr[i];
        }

        if (curSum >= MaxSum) {
            count++;
        }

        for (int i = k; i < arr.length; i++) {
            curSum = curSum + arr[i] - arr[i - k];
            if (curSum >= MaxSum) {
                count++;
            }
        }
        return count;
    }
}