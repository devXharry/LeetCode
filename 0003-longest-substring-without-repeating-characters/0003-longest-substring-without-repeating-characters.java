class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] cArray = s.toCharArray();
        int n = cArray.length;
        int left = 0;
        int right = 0;
        int maxLength = 0;
        boolean[] inWin = new boolean[128];
        while (right < n) {
            char currentChar = cArray[right];

            while (inWin[currentChar]) {
                inWin[cArray[left]] = false;
                left++;
            }

            inWin[currentChar] = true;

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}