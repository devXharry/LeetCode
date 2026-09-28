class Solution {
    public String removeStars(String s) {
        char[] fg = s.toCharArray();
        int n = fg.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (fg[right] == '*') {
                left--;
            } else {
                fg[left] = fg[right];
                left++;
            }
        }
        return new String(fg, 0, left);
    }
}