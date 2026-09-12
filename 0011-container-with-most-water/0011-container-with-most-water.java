class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxW = 0;
        while (i < j) {
            int wat = Math.min(height[i], height[j]) * (j - i);

            if (wat > maxW) {
                maxW = wat;
            }

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxW;
    }
}