class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] tr = new int[2];
        int nh = numbers.length;
        int left = 0;
        int right = nh - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left+1, right+1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}